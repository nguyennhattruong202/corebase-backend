package com.truong.corebase.controller;

//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.ErrorResponse;
//import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/api/v1/auth")
//@Tag(name = "Authentication", description = "Đăng ký, đăng nhập, refresh token")
//@RequiredArgsConstructor
public class AuthController {
//  @Operation(
//          summary = "Đăng nhập",
//          description = "Trả về access token (15 phút) và refresh token (7 ngày)"
//  )
//  @ApiResponses({
//          @ApiResponse(responseCode = "200", description = "Đăng nhập thành công"),
//          @ApiResponse(responseCode = "401", description = "Sai email hoặc mật khẩu",
//                  content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
//  })
//  @PostMapping("/login")
//  public ResponseEntity<AuthResponse> login(
//          @Valid @RequestBody
//          @io.swagger.v3.oas.annotations.parameters.RequestBody(
//                  description = "Thông tin đăng nhập",
//                  required = true)
//          LoginRequest request) {
//    return ResponseEntity.ok(authService.login(request));
//  }
//
//  @Operation(summary = "Lấy thông tin user hiện tại")
//  @SecurityRequirement(name = "bearerAuth")
//  @GetMapping("/me")
//  public ResponseEntity<UserResponse> me(
//          @AuthenticationPrincipal UserDetails userDetails) {
//    return ResponseEntity.ok(authService.getCurrentUser(userDetails));
//  }
}
