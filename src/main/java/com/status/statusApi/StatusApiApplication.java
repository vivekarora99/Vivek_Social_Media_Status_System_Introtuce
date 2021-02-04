package com.status.statusApi;

import com.status.statusApi.repository.StatusRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = StatusRepository.class)
public class StatusApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusApiApplication.class, args);
	}

}
