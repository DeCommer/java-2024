package com.joseph.example;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);

 			Random rand = new Random();
            int n = rand.nextInt(100);
			double test = Math.pow(n, 2);
            System.out.printf("Random number: %d", n);
			System.out.println("");
            System.out.printf("Random number squared: %f", test);
			System.out.println("");

	}

}
