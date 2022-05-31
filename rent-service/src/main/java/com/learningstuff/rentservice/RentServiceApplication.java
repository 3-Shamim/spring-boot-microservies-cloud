package com.learningstuff.rentservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
        info = @Info(title = "Rent API", version = "V1", description = "Documentation Rent API v1.0"),
        security = {@SecurityRequirement(name = "bearer_security")},
        servers = {
                @Server(url = "{custom_server}", variables = {@ServerVariable(name = "custom_server", defaultValue = "http://localhost:8080/rent")})
        }
)
public class RentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentServiceApplication.class, args);
    }

}
