package com.stub.rs.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="RocketShip Middleware Endpoints"))
public class RsPolicyServiceStubApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsPolicyServiceStubApplication.class, args);
	}

}
