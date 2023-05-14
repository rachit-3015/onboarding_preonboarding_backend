package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.project.services.LoginService;
import com.project.services.impl.LoginServiceImpl;

@Configuration
@EnableJpaRepositories(basePackages = "com.project.repositories")
public class AppConfig {

	@Bean
	public LoginService loginService() {
		return new LoginServiceImpl();
	}	

	
}
