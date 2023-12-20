package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Students;

public interface IStudentService {
		public List<Students> getStudentByName(String name)throws SQLException,Exception;
}
