package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.infosys.repository")
@EntityScan("com.infosys.model")

public class InfySecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfySecurityApplication.class, args);
	}

}
