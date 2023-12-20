package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Employe;

public interface IEmployeService {
	public List<Employe> getEmploye()throws SQLException,Exception;
}
