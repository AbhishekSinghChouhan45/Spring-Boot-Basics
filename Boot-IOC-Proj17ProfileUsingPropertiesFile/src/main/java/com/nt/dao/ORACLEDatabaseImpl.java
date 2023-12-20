package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employe;
@Repository("daoOracle")
@Profile({"uat","prod"})
public class ORACLEDatabaseImpl implements IDataBaseDAO {
	@Autowired
	private DataSource ds;
	//CONSTANT VARIABLE
	private String GET_EMP_DATA = "SELECT * FROM employe_data";
	@Override
	public List<Employe> getEmploye()throws SQLException,Exception{
		List<Employe> list = new ArrayList<Employe>();
		try(Connection con = ds.getConnection();
			  PreparedStatement ps = con.prepareStatement(GET_EMP_DATA);
			  ResultSet rs = ps.executeQuery();){
			System.out.println("Data Coming for Oracle DB");

			while (rs.next()) {
					Employe emp = new Employe();
					emp.setEId(rs.getInt(1));
					emp.setEName(rs.getString(2));
					emp.setEAdd(rs.getString(3));
					emp.setENumbers(rs.getLong(4));
					emp.setEDesignation(rs.getString(5));
					emp.setESalary(rs.getDouble(6));
					list.add(emp);
				}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return list;
	}
	public ORACLEDatabaseImpl() {
		System.out.println("ORACLEDatabaseImpl:: 0-param constructor"); 
	}
}
