package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import com.nt.sbeans.CarsEngine;

@SpringBootApplication
@Scope("prototype")
public class BootIocProj04CarsEngineApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj04CarsEngineApplication.class, args);
		CarsEngine e = ctx.getBean("cars",CarsEngine.class);
		e.getEngine("Hyd","Chn");
	}
	public BootIocProj04CarsEngineApplication() {
		System.out.println("BootIoc");
	}
}
