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
@Repository("daoMysql")
@Profile({"uat","prod"}) //Setting profile of this class
public class OracleDaoImpl implements IDatabaseDAO {
	//CONSTANT VARIABLES 
	private String GET_EMP_QUERY = "SELECT * FROM EMPLOYE_DATA";
	//Field injection of Datasource object 
	@Autowired
	private DataSource ds;
	@Override
	public List<Employe> getEmploye() throws SQLException, Exception {
		System.out.println("OracleDaoImpl DB Executing");
		List<Employe> list = null;
		try(Connection con = ds.getConnection();
			  PreparedStatement ps = con.prepareStatement(GET_EMP_QUERY);
			  ResultSet rs = ps.executeQuery();){
			list = new ArrayList<Employe>();
			while (rs.next()) {
				//For every data creating Object of Employe Class to set the data and to the list collection
				Employe emp = new Employe();
				emp.setEID(rs.getInt(1));
				emp.setEName(rs.getString(2));
				emp.setEAdd(rs.getString(3));
				emp.setENumber(rs.getLong(4));
				emp.setEDesignation(rs.getString(5));
				emp.setESalary(rs.getDouble(6));
				//Here adding the emp object to the list collection
				list.add(emp);
			}
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
		//return the list collection refrence number
		return list;
	}
	public OracleDaoImpl() {
		System.out.println("OracleDaoImpl:: 0-param constructor");
	}
}
