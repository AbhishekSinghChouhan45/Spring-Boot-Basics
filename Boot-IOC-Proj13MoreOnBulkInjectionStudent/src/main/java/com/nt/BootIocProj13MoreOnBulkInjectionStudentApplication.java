package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employe;

@SpringBootApplication
public class BootIocProj13MoreOnBulkInjectionStudentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj13MoreOnBulkInjectionStudentApplication.class, args);
		Employe emp = ctx.getBean("emp",Employe.class);
		System.out.println(emp);
	}

}
