package com.nt;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeController;
import com.nt.model.Employe;

@SpringBootApplication
public class BootIocProj19ProfileUsingSingleYmlFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj19ProfileUsingSingleYmlFileApplication.class, args);
		EmployeController ec = ctx.getBean("controller",EmployeController.class);
		try {
			List<String> emp =ec.getEmploye();
			emp.forEach(st->{
				System.out.println(st);
			});
		} catch (SQLException e) {
			System.out.println("Here we are getting exception in client side: \n\t\t\t"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Here we are getting exception in client side: \n\t\t\t"+e.getMessage());
		}
		
	}
	public BootIocProj19ProfileUsingSingleYmlFileApplication() {
		System.out.println("BootIocProj19ProfileUsingYmlFileApplication:: 0-param constructor");
	}
}
