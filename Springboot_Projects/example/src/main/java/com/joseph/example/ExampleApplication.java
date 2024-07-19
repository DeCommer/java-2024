package com.joseph.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
        String name = "Joseph DeCommer";
		String country = "U.S.A.";
		int age = 44;
		double height = Math.floor((5.9 * 12) * 100) / 100;

		String formatted = String.format("my name is %s. I am from the %s. I am %d years old and I am %f in tall", name, country, age, height);
		System.out.println(formatted);
	}

}
