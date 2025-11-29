package org.proyecto.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // 🔹 Aplica a todos los endpoints
                        .allowedOrigins("http://localhost:3000") // 🔹 Origen del frontend
                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS") // 🔹 Métodos permitidos
                        .allowedHeaders("*") // 🔹 Permitir todos los encabezados
                        .allowCredentials(true); // 🔹 Permitir cookies o autenticación
            }
        };
    }
}
