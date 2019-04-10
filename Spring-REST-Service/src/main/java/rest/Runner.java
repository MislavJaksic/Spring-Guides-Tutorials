package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import rest.external.ExternalConfig;

@SpringBootApplication
@EnableConfigurationProperties(ExternalConfig.class)
public class Runner {
	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
}
