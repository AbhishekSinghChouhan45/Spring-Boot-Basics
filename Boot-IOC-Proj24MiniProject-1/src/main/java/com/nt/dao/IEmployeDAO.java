package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Employe;

public interface IEmployeDAO {
		public List<Employe> getAllEmployes()throws SQLException,Exception;
		public List<Employe> getNamedEmployes(String name)throws SQLException,Exception;
		public String setEmployes(String eName,String eAdd,Long eNumbers,String eDesignation,Double eSalary)throws SQLException,Exception;
		
}
