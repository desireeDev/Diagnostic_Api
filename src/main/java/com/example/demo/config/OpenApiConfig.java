package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.*;

/**
 * Configuration globale Swagger / OpenAPI.
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI diagnosticApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Diagnostic API")
                        .description("API REST de gestion de diagnostics")
                        .version("0.1"));
    }
}
