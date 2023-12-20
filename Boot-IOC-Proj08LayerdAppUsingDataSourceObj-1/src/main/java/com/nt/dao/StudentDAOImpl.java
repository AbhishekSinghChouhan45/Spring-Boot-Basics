package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.model.Students;

@Repository("studDAO")
public class StudentDAOImpl implements IStudentsDAO{
	@Autowired
	public void getDS(DataSource ds) {
		this.ds = ds;
		System.out.println("StudentDAOImpl Data Source obj injected successfully");
	}
	private DataSource ds;
	//Constant variable
	private static final String GET_STUDENTS_BY_NAME = "SELECT * FROM STUDENT WHERE NAME = (?)";
	// Overriding getStudentByName() method of Interface 
	@Override
	public List<Students> getStudentByName(String Name) throws SQLException,Exception {
				List<Students> list = null;
				try(Connection con = ds.getConnection(); // Outer try
					PreparedStatement ps = con.prepareStatement(GET_STUDENTS_BY_NAME);
					){
					ps.setString(1, Name);
					try(ResultSet rs = ps.executeQuery()){ // Inner try
						list = new ArrayList<Students>();
						while (rs.next()) {
							Students stud = new Students();
							stud.setSno(rs.getInt(1));
							stud.setSname(rs.getString(2));
							stud.setSclass(rs.getInt(3));
							stud.setSavg(rs.getFloat(4));
							list.add(stud); // Adding Student class object to the list collection
						} // inner try closed
					}
				}catch (SQLException e) { // Catching SQLException and rethrowing to its caller class(Exception Prapogation)
					throw e;
				}catch (Exception e) { //Catching Unknown Exeption and rethrowing to its calller class
					throw e;
				}
		return list;		// retrurning list collection class obje or ref
	}
	public StudentDAOImpl() {
		System.out.println("StudentDAOImpl:: 0-param contructor");
	}
}
