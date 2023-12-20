package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.EmployeController;

@SpringBootApplication
//@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj17ProfileUsingPropertiesFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj17ProfileUsingPropertiesFileApplication.class, args);
		EmployeController emp = ctx.getBean("empController",EmployeController.class);
		try {
			emp.getEmploye();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
