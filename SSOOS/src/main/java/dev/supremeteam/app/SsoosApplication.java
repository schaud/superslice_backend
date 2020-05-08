package dev.supremeteam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("dev.supremeteam.entities")
@ComponentScan("dev.supremeteam")
@EnableJpaRepositories("dev.supremeteam.repositories")
public class SsoosApplication {

	public static void main(String[] args) {

		SpringApplication.run(SsoosApplication.class, args);
	
	
	}

}
