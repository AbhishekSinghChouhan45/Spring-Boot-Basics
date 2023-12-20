package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Employe;

public interface IDatabaseDAO {
	public List<Employe> getEmploye()throws SQLException,Exception;
}
