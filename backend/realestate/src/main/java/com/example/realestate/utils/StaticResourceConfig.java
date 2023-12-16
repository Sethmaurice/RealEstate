package com.example.realestate.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class StaticResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/image/**") // Define the URL pattern to access images
                .addResourceLocations("file:///C:/Users/Administrator/Desktop/backend/backend/realestate/src/main/resources/image"); // Set the path to your images directory
    }

}
