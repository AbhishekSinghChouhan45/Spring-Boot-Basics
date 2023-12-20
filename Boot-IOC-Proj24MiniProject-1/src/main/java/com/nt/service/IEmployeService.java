package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Employe;

public interface IEmployeService {
	public List<Employe> getAllEmploye()throws SQLException,Exception;
	public List<Employe> getNamedEmploye(String name)throws SQLException,Exception;
	public String setEmploye(String name,String add,Long number,String Designation,Double Salary)throws SQLException,Exception;
}
