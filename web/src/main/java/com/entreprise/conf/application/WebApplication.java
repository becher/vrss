package com.entreprise.conf.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
		(exclude = {SecurityAutoConfiguration.class,MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@Configuration()
//@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class,MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan(basePackages={"com"})
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
