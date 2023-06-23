package com.example.service;

import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class Greetings {
    @GraphQLClientApi(endpoint = "http://localhost:8080/service/graphql")
    public interface HelloApi {
        @Query String hello();
    }

    @Inject
    HelloApi api;

    @Query
    public String greeting() {
        return api.hello() + ", World!";
    }
}
