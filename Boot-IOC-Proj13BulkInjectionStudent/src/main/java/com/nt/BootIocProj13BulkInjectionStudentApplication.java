package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.StudentResult;

@SpringBootApplication
public class BootIocProj13BulkInjectionStudentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj13BulkInjectionStudentApplication.class, args);
		StudentResult sr = ctx.getBean("sr",StudentResult.class);
		System.out.println(sr);
	}

}
