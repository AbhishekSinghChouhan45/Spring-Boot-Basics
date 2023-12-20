package com.nt.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IDataBaseDAO;
import com.nt.model.Employe;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService {
	@Autowired
	private IDataBaseDAO dao;
	@Override
	public List<Employe> getEmploye()throws SQLException,Exception{
		List<Employe> list = null;
		try {
			list = dao.getEmploye();
		for(Employe emp : list) {
			emp.setEAggression(new Random().nextInt(5));
		}
		}catch (Exception e) {
			System.out.println("xe "+e.getMessage());
			throw e;
		}
		return list;
	}

}
