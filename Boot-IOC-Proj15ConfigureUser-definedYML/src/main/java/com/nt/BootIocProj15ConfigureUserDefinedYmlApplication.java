package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.University;

@SpringBootApplication
public class BootIocProj15ConfigureUserDefinedYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj15ConfigureUserDefinedYmlApplication.class, args);
		University u = ctx.getBean("university",University.class);
		System.out.println(u);
		((ConfigurableApplicationContext) ctx).close();
	}

}
