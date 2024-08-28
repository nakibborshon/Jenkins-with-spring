package com.BJIT.demo.SpringBootApplication;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoSpringBootApplication implements CommandLineRunner {

	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(DemoSpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("CI task");
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("CI task 2nd attempt");
	}

}
