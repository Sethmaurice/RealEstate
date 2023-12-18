package com.example.realestate.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("https://realestate-neon-mu.vercel.app", "http://localhost:3000", "https://realestate-qfhq.onrender.com")
//                        .allowedMethods("*") // Allow all HTTP methods
//                        .allowedHeaders("*") // Allow all headers
//                        .allowCredentials(true); // some changes
//            }
//        };
//    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Allow specific origins
        config.addAllowedOrigin("http://localhost:3000"); // Update with your frontend URL
        config.addAllowedOrigin("https://realestate-qfhq.onrender.com");
        config.addAllowedOrigin("https://realestate-neon-mu.vercel.app");
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        config.getAllowCredentials();
//

        // Allow specific methods
//        config.addAllowedMethod("GET");
//        config.addAllowedMethod("POST");
//        config.addAllowedMethod("PUT");
//        config.addAllowedMethod("DELETE");
//        config.getAllowCredentials();

        // Allow specific headers
//        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
