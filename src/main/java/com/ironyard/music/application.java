package com.ironyard.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by favianalopez on 10/24/16.
 */

@EnableSwagger2
@SpringBootApplication
public class application {

    public static void main(String[] args ){
        SpringApplication.run(application.class, args);
    }
    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("service")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/service.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Album API with Swagger, SpringBoot, JPA via Hibernate")
                .description("Create your list here")
                .termsOfServiceUrl("http://theironyard.com")
                .contact("Faviana Lopez")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.1")
                .build();
    }


}
