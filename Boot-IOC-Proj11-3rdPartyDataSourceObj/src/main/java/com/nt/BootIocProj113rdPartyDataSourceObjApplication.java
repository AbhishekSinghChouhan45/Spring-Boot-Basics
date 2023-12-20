package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.EmployeController;

@SpringBootApplication
public class BootIocProj113rdPartyDataSourceObjApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj113rdPartyDataSourceObjApplication.class, args);
		EmployeController emp = ctx.getBean("emp",EmployeController.class);
		emp.result();
	}
	@Bean
	public ComboPooledDataSource cpd() throws Exception{
			System.out.println("BootIocProj113rdPartyDataSourceObjApplication.cpd()");
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			cpds.setDriverClass("oracle.jdbc.driver.OracleDriver");
			cpds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			cpds.setUser("system");
			cpds.setPassword("root");
			return cpds;
	}
}
