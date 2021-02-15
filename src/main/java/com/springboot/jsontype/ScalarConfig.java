package com.springboot.jsontype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class ScalarConfig {
	@Bean
	public GraphQLScalarType Json() {
		return ExtendedScalars.Json;
	}
}
