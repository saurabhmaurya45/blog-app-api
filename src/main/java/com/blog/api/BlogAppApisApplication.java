package com.blog.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
//@EnableSwagger2
//@EnableWebMvc
public class BlogAppApisApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);

	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	
	
	

}
