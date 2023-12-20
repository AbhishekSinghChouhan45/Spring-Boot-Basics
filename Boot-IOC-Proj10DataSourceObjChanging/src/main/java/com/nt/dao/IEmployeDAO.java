package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Employe;

public interface IEmployeDAO {
		public List<Employe> getEmployeDetails() throws SQLException,Exception;
}
