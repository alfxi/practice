package ru.neoflex.practice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class SpingdocConfig {

    /**
     * используется для создании документации с помощью Swagger
     * для доступа перейти по адрессу:
     * localhost:8080/swagger-ui/index.html
     */
    @Bean
    public OpenAPI baseOpenAPI(){
        return new OpenAPI().info(new Info().title("Vacation Calculator Documentation").version("0.0.1")
                .description("Used to calculate vacation monetary compensation for workers"));
    }
}