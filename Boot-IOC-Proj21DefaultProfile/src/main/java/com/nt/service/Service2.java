package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.dao.IDatabaseDAO;
import com.nt.model.Employe;
@Service("service2")
@Profile({"service2"})
public class Service2 implements IEmployeService {
	//Here we are getting the object of DAO classes
	@Autowired
	private IDatabaseDAO dao;
	//Bussiness Method
	@Override
	public List<Employe> getEmploye() throws SQLException, Exception {
		System.out.println("Service2 Excecuted");
		List<Employe> list = null;
		try {
			list = dao.getEmploye();
			for(Employe emp:list) {
				emp.setEAggression(null); // Setting one more value as bussinesss value in Service class
			}
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		return list;
	}
	public Service2() {
		System.out.println("Service2:: 0-param constructor");
	}
}
