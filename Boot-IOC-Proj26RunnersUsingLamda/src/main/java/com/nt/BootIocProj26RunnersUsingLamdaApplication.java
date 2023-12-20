package com.nt;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class BootIocProj26RunnersUsingLamdaApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootIocProj26RunnersUsingLamdaApplication.class, args);
	}
	//Creating CommandLineRunner class as spring bean using @Bean Method
	@Bean
	public ApplicationRunner getAR() {
			// There is totaly 4 improvments are in Lambda Expression we can see them below
		
		          //Approach 1
		/*	 
		    	ApplicationRunner runner =(ApplicationArguments args) ->{                    
						System.out.println("------------------------AR--------------------");
				};
				return runner;
		 */	
		         //Improvment 1 no need to give flower braces its completly optional
		/* 	
		 		ApplicationRunner runner = (ApplicationArguments args) -> System.out.println("----------------ARs--------------");   
				return runner;
		*/
				//Improvment 2 no need of return satatement its completly optional
		/*
			  ApplicationRunner runner = (ApplicationArguments args) ->  System.out.println("-----------ALRs-----------");
				return runner;
	   */
		        // Improvment 3 params are optional 
		/*
		ApplicationRunner runner = (args)->System.out.println("-----------ALRR-------------");
		return runner;
		*/
		// Improvment 4 param name can be chaged
		
			ApplicationRunner runner = (aa)->System.out.println("-------------ARR--------------");
			return runner;
	}
	@Bean
	@Order(1)
	public CommandLineRunner getCLR() {
		CommandLineRunner runner = (String a[]) ->{
			System.out.println("-----------------CLR------------------");
		};
		return runner;
	}
	
	
	
}	
