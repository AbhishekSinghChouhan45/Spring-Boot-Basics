package com.nt.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeDAO;
import com.nt.model.Employe;
@Service("empService")
public class EmployeService implements IEmployeService {
	@Autowired
	  private IEmployeDAO dao;
	@Override
	public List<Employe> getAllEmploye() throws SQLException, Exception {
		List<Employe> list = null;
		try {
			list = dao.getAllEmployes();
			for(Employe emp:list) {
				emp.setEAggression(new Random().nextInt(5));
			}
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Employe> getNamedEmploye(String name) throws SQLException, Exception {
		List<Employe> list = null;
		try {
			list = dao.getNamedEmployes(name);
			for(Employe emp:list) {
				emp.setEAggression(new Random().nextInt(5));
			}
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public String setEmploye(String name, String add, Long number, String Designation, Double Salary)throws SQLException, Exception {
		String msg = null;
		try {
			msg = dao.setEmployes(name, add, number, Designation, Salary);
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return msg;
	}
	
}
