package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeController;
import com.nt.model.Employe;

@SpringBootApplication
public class BootIocProj09LayerdAppUsingDataSourceObj2OracleApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx = 	SpringApplication.run(BootIocProj09LayerdAppUsingDataSourceObj2OracleApplication.class, args);
	 EmployeController e = ctx.getBean("emp",EmployeController.class);
	 List<Employe> list= e.result();
	 for(Employe ee:list) {
		 System.out.println("ENO: "+ee.getEno());
		 System.out.println("ENAME: "+ee.getEname());
		 System.out.println("EADD: "+ee.getEadd());
		 System.out.println("ESAL: "+ee.getEsal());
		 System.out.println("EGSAL: "+ee.getEGsal());
		 System.out.println("ENSAL: "+ee.getENsal());
	 }
	 System.out.println(e.result());
	}

}
