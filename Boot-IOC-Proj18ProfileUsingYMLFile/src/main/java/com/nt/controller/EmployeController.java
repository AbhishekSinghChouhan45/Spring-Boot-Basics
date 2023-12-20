package com.nt.controller;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;

@Controller("controller")
public class EmployeController {
	//Here we are injecting object of Service class 
	@Autowired
//	@Qualifier("service2")
	private IEmployeService service;
	public List<String> getEmploye()throws SQLException,Exception{
		List<Employe> list = null;
		List<String> emps = new ArrayList<String>();
		try {
			list = service.getEmploye();
				for(Employe emp: list) {
					emps.add(emp.toString());
				}
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return emps;
	}
	public EmployeController() {
		System.out.println("EmployeController:: 0-param constructor");
	}
}
