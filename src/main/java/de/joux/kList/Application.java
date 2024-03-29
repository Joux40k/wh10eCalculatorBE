package de.joux.kList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "de.joux.kList")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
