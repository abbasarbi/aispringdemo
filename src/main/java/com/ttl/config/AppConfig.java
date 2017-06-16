package com.ttl.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@Order(1)
@EnableWebMvc
@ComponentScan(basePackages = "com.ttl")
class AppConfig extends WebMvcConfigurerAdapter{
	
	
	
}
