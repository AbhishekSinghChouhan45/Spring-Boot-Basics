package com.nt.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;

@Controller("empController")
public class EmployeController {
	@Autowired
	private IEmployeService service;
	//All Employe Data method()
	public List<Employe> getEmploye() throws SQLException,Exception{
		List<Employe> list = null;
		try {
			list = service.getAllEmploye();
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return list;
	}
	//Named Employe Data method()
	public List<Employe> getNamedEmploye(String name) throws SQLException,Exception{
		List<Employe> list = null;
		try {
			list = service.getNamedEmploye(name);
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return list;
	}
	//Registring the employe data
	public String setEmploye(String name,String add,Long number,String Designation,Double salary)throws SQLException,Exception{
		String msg = null;
		try {
			msg = service.setEmploye(name, add, number, Designation, salary);
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return msg;
	}
}
