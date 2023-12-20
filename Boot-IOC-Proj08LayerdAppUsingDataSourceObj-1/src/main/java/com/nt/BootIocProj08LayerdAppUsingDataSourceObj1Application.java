package com.nt;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.StudentController;
import com.nt.model.Students;

@SpringBootApplication
public class BootIocProj08LayerdAppUsingDataSourceObj1Application {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootIocProj08LayerdAppUsingDataSourceObj1Application.class, args);
	StudentController stud = ctx.getBean("studController",StudentController.class);
			try {
				List<Students> list = stud.getStudentsByName("Dipti Sahu");
				if(list.size() > 0) {
				for(Students st:list) {
					System.out.println(st.toString());
				}
				}else {
					System.out.println("No Students found");
				}
			} catch (SQLException e) {
				System.out.println("Reading Exception in Main "+e.getMessage());
			} catch (Exception e) {
				System.out.println("Reading Exception in Main "+e.getMessage());
			}
			((ConfigurableApplicationContext) ctx).close();
	}
	public BootIocProj08LayerdAppUsingDataSourceObj1Application() {
		System.out.println("BootIocProj08Layer:: 0-param contructor");
	}
}
