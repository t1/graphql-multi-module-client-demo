package com.example.service;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class Hellos {
    @Query
    public String hello() {
        return "Hello";
    }
}
