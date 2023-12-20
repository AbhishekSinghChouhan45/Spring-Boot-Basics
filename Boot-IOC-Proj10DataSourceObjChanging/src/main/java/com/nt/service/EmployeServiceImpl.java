package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeDAO;
import com.nt.model.Employe;
@Service("empService")
public class EmployeServiceImpl implements IEmployeService {
	@Autowired
	private IEmployeDAO dao; 
	@Override
	public List<Employe> getEmploye() throws SQLException, Exception {
		List<Employe> list = null;
		try {
				list = dao.getEmployeDetails();
				for(Employe e:list) {
					Integer sal = e.getEsal();
					e.setEGsal(sal + (sal *0.4f));
					e.setENsal(sal - (e.getEGsal() * 0.4f));
				}
		}catch (Exception e) {
			System.out.println("EX "+e.getMessage());
			throw e;
		}
		return list;
	}

}
