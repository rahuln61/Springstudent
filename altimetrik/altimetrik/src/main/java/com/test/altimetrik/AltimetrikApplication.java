package com.test.altimetrik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.altimetrik.resources.UserResource;
import com.test.altimetrik.service.UserCrudService;

@SpringBootApplication
public class AltimetrikApplication {


	public static void main(String[] args) {
		SpringApplication.run(AltimetrikApplication.class, args);
		
	}

}
