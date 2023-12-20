package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hospital;

@SpringBootApplication
public class BootIocProj14BulkInjectionUsingYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj14BulkInjectionUsingYmlApplication.class, args);
		Hospital h = ctx.getBean("h",Hospital.class);
		System.out.println(h);
		((ConfigurableApplicationContext) ctx).close();
	}

}
