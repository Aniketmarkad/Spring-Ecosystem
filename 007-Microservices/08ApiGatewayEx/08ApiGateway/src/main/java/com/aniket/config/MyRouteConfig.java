package com.aniket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class MyRouteConfig 
{
	@Bean
	public RouteLocator configRoutes(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route("cartRoutingId",r->r.path("/cart/**").uri("lb://CART-SERVICE"))
			 	.route("orderRoutingId",r->r.path("/order/**").uri("lb://ORDER-SERVICE"))
				.build();
	}

}
