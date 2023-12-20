package com.nt.controller;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;

@Controller("empController")
public class EmployeController {
	@Autowired
	private IEmployeService service;
	public void getEmploye()throws SQLException,Exception{
			List<Employe> list = service.getEmploye();
			for(Employe emp: list) {
				System.out.println("Employe ID: "+emp.getEId()+" Employe Name: "+emp.getEName()+" Employe Address: "+emp.getEAdd()+" Employe Number: "+emp.getENumbers()+" Employe Designation: "+emp.getEDesignation()+" Employe Salary: "+emp.getESalary()+" Employe Aggression rate: "+emp.getEAggression());
			}
	}
}
