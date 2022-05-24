package com.corcino.bookstore.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    private static final String API_TITLE = "RESTful Bookstore API";
    private static final String API_DESCRIPTION = "Some description about your API";
    private static final String API_VERSION = "v1";
    private static final String API_GROUP = "bookStoreApi";
    private static final String CONTACT_NAME = "Laion Corcino";
    private static final String CONTACT_EMAIL = "laioncorcino@gmail.com";
    private static final String CONTACT_GITHUB = "https://github.com/laioncorcino";

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group(API_GROUP)
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI bookStoreOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .version(API_VERSION)
                        .description(API_DESCRIPTION)
                        .contact(new Contact().name(CONTACT_NAME).email(CONTACT_EMAIL).url(CONTACT_GITHUB))
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")));
    }

}
