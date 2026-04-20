package com.truong.corebase.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {
  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
            .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
            .components(new Components()
                    .addSecuritySchemes("bearerAuth",
                            new SecurityScheme()
                                    .type(SecurityScheme.Type.HTTP)
                                    .scheme("bearer")
                                    .bearerFormat("JWT")
                                    .in(SecurityScheme.In.HEADER)
                                    .name("Authorization")))
            .info(new Info()
                    .title("Backend API")
                    .version("1.0.0")
                    .description("API documentation for Spring Boot backend")
                    .contact(new Contact()
                            .name("Nguyen Nhat Truong")
                            .email("nhattruongnguyen202@gmail.com")
                            .url("https://github.com/nguyennhattruong202"))
                    .license(new License()
                            .name("Apache 2.0")
                            .url("https://springdoc.org")))
            .servers(List.of(
                    new Server().url("http://localhost:8080").description("Local Server"),
                    new Server().url("https://your-app.onrender.com").description("Production Server")
            ));
  }
}
