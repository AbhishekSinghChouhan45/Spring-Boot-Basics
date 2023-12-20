package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeController;

@SpringBootApplication
public class BootIocProj10DataSourceObjChangingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj10DataSourceObjChangingApplication.class, args);
		EmployeController emp = ctx.getBean("emp",EmployeController.class);
		 System.out.println(emp.result());
	}

}
