package net.skhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"net.skhu.security1.controller"})
@ComponentScan(basePackages = {"net.skhu.security1.service"})
@ComponentScan(basePackages = {"net.skhu.security1.repository"})

@SpringBootApplication
public class Security1Application {

	public static void main(String[] args) {
		SpringApplication.run(Security1Application.class, args);
	}

}
