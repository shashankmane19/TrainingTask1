package com.basic.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"com.basic.springboot.controller","com.basic.springboot.entity"})
public class SpringbootApplication  
{  
public static void main(String[] args)   
{  
SpringApplication.run(SpringbootApplication.class, args);  
}  
} 
