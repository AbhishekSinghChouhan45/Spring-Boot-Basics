package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessage;

@SpringBootApplication
public class BootProj01InsertingValuesFromPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BootProj01InsertingValuesFromPropertiesApplication.class, args);
		WishMessage wm = ctx.getBean("wmg",WishMessage.class);
		System.out.println(wm.genrateMessage());
		((ConfigurableApplicationContext) ctx).close();
	}
	@Bean
	public LocalDateTime time() {
		System.out.println("time()");
		return LocalDateTime.now();
	}
	public BootProj01InsertingValuesFromPropertiesApplication() {
		System.out.println("Main con");
	}
}
