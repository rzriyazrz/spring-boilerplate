package com.example.picasso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class PicassoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicassoApplication.class, args);
	}

}
