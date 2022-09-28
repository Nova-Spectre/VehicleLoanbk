package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableJpaRepositories

public class VehicleLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleLoanApplication.class, args);
		System.out.println("APP IS STARTED");
	}

}
