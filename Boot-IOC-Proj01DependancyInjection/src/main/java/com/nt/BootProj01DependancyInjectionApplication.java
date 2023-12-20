package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.nt.sbeans.WishMessage;

@SpringBootApplication
@Scope("prototype")
public class BootProj01DependancyInjectionApplication {

	public static void main(String[] args) {
//		 ApplicationContext ctx = SpringApplication.run(BootProj01DependancyInjectionApplication.class, args);
//		 System.out.println(ctx);
//		 WishMessage wm = ctx.getBean("wmg",WishMessage.class);
//		 System.out.println(wm.genrateMessage("Rani"));
//		 ((ConfigurableApplicationContext) ctx).close();
	}
	//Bean Method to create and return object of LocalDateTime class
	@Bean
	public LocalDateTime time() {
		System.out.println("time()");
		return LocalDateTime.now();
	}
	//Constructor
	public BootProj01DependancyInjectionApplication() {
		System.out.println("BootProj01Dependancy:: 0-param constructor");
	}
}
