package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Students;

public interface IStudentsDAO {
		public List<Students> getStudentByName(String Name)throws SQLException,Exception;
}
