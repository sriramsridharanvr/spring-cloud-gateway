package com.example.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
//				.route("cat-service", r -> r.path("/cats/**", "/api/cats/**")
//						.uri("lb://CAT-SERVICE"))
//				
//				.route("dog-service", r -> r.path("/dogs/**")
//						.uri("lb://DOG-SERVICE"))
				
				.route("todo-service", r -> r.path("/api/todos/**")
						.uri("lb://TODO-SERVICE"))
				
				.route("profile-service", r -> r.path("/api/profile/**")
						.uri("lb://PROFILE-SERVICE"))
				
				.build();
	}
}
