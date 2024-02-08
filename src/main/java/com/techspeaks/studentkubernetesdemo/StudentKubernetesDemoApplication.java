package com.techspeaks.studentkubernetesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class StudentKubernetesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentKubernetesDemoApplication.class, args);
	}

}
