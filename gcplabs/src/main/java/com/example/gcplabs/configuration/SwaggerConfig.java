package com.example.gcplabs.configuration;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(metaData());
    }
	
	private ApiInfo metaData()
	{
		return new ApiInfoBuilder()
				.title("Swagger Configuration")
				.description("Swagger configuration for GCP Labs")
				.version("0.0.1")
				.license("Apache 2.0")
				.licenseUrl("http:.....")
				.build();
	}

}
