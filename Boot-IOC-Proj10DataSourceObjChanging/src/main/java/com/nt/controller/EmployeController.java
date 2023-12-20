package com.nt.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;

@Controller("emp")
public class EmployeController {
	@Autowired
	private IEmployeService service;
	public List<Employe> result(){
		List<Employe> list = null;
		try {
			list = service.getEmploye();
			System.out.println(list.get(1));
		}catch (Exception e) {
			System.out.println("Getting exception in "+e.getMessage());
		}
		return list;
	}
}
