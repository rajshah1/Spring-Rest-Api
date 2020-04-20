package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cglib.core.WeakCacheKey;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories("com.infosys.repository")
@EntityScan("com.infosys.model")
public class InfytelDemoApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(InfytelDemoApplication.class, args);
	}
	//code for coross cuting js
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "POST");
	}

}
