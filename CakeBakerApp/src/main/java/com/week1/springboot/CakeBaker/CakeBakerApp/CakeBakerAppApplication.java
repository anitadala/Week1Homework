package com.week1.springboot.CakeBaker.CakeBakerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeBakerAppApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(CakeBakerAppApplication.class, args);
	}

	@Autowired
	CakeBaker cakeBaker;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakeBaker.BakeCake());
	}
}
