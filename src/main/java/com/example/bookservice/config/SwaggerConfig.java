package com.example.bookservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.StringVendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.reloadly.bookservice.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata());
    }

    private ApiInfo metadata() {

        return new ApiInfo(
                "Book Service",
                "Book Service",
                "1.0",
                "Terms of service",
                new Contact("Reloadly Networks", "https://www.reloadly.com", "support@reloadly.com"),
                "Apache License Version 2.0",
                "https:/www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>(Collections.singleton(new StringVendorExtension("", "")))
        );
    }
}
