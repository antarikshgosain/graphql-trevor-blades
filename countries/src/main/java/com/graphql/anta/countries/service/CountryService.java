package com.graphql.anta.countries.service;

import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

public class CountryService {

    private final HttpGraphQlClient graphQlClient;


    public CountryService(HttpGraphQlClient graphQlClient) {
        WebClient client = WebClient.builder()
                .baseUrl("https://countries.trevorblades.com/")
                .build();
        this.graphQlClient = HttpGraphQlClient.builder(client).build();
    }
}
