package com.inventory.officeitems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories
// @EnableWebMvc
public class OfficeItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficeItemsApplication.class, args);
	}

}
