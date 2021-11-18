package com.Annotations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = "com.Annotations")
public class CollegeConfig {
	@Bean
	public College collegeBean() {
		College college = new College();
		return college;
	}

}
