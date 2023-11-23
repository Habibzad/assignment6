package com.meritamerica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.meritamerica.assignment6.repository")
@SpringBootApplication
public class MeritBankApp {

	public static void main(String[] args) {
		SpringApplication.run(MeritBankApp.class, args);
	}

}
