package com.iteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceGatewayApplication.class, args);
	}
	@Bean
	 RouteLocator routes(RouteLocatorBuilder builder) { 
	 return builder.routes()
//	.route(r -> 
//	r.path("/societes/**").uri("lb://SERVICE-SOCIETE"))
//	.route(r -> 
//	r.path("/societe/**").uri("http://localhost:3000"))		 
//			 .build(); 
	       .route(r -> r.path("/client/**")
                   .uri("lb://CLIENT-MICROSERVICE"))
	       .build();
	 }
	@Bean
	DiscoveryClientRouteDefinitionLocator 
	dynamicRoutes(ReactiveDiscoveryClient rdc,DiscoveryLocatorProperties 
	dlp) { 
	return new DiscoveryClientRouteDefinitionLocator(rdc, dlp); 
	}
}
