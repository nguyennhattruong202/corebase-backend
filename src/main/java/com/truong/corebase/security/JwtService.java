package com.truong.corebase.security;

import com.truong.corebase.config.JwtProperties;
import com.truong.corebase.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class JwtService {
  private final JwtProperties jwtProperties;
  private SecretKey secretKey;

  @PostConstruct
  void init() {
    byte[] keyBytes = Decoders.BASE64URL.decode(jwtProperties.secret());
    this.secretKey = Keys.hmacShaKeyFor(keyBytes);
  }

  public String generateAccessToken(User user) {
    return buildToken(user, jwtProperties.accessTokenExpiration());
  }

  public String generateRefreshToken(User user) {
    return buildToken(user, jwtProperties.refreshTokenExpiration());
  }

  private String buildToken(User user, long expiration) {
    Instant now = Instant.now();
    return Jwts.builder()
            .subject(user.getId().toString())
            .claim("email", user.getEmail())
            .claim("role", user.getRole().name())
            .issuedAt(Date.from(now))
            .expiration(Date.from(now.plusMillis(expiration)))
            .signWith(secretKey)
            .compact();
  }

  public Claims extractAllClaims(String token) {
    return Jwts.parser()
            .verifyWith(secretKey)
            .build()
            .parseSignedClaims(token)
            .getPayload();
  }

  public String extractUserId(String token) {
    return extractAllClaims(token).getSubject();
  }

  public boolean isTokenValid(String token) {
    try {
      return extractAllClaims(token).getExpiration().after(new Date());
    } catch (JwtException | IllegalArgumentException e) {
      return false;
    }
  }
}
