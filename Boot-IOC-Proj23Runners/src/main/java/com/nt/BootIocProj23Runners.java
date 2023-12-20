package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BootIocProj23Runners {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj23Runners.class, args);
/* A Good Programmer never writes his b logic code in main method they jounrly writes b logic code in Runner method of a class which implementing xxxRunner(I)
*   There is two types of Runners(I) 
*   1) CommandLineRunner(String... args) which having parameter type String
*   2) ApplicationRunner(Application args) which having parameter type Application			
*   These Runners are jounraly execute one time after initializing and injecting all the neccessary injections
*/
	}
	public BootIocProj23Runners() {
		System.out.println("BootIocProj23Runners:: 0-param constructor");
	}
}
