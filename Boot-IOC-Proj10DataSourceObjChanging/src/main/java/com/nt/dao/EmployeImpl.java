package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employe;
@Repository("empDAO")
public class EmployeImpl implements IEmployeDAO{
	@Autowired
	private DataSource ds;
	private static final String GET_EMP = "SELECT * FROM Employe_info";
	@Override
	public List<Employe> getEmployeDetails() throws SQLException, Exception {
		List<Employe> list = null;
		try(Connection con = ds.getConnection();
			 PreparedStatement ps = con.prepareStatement(GET_EMP);
			 ResultSet rs = ps.executeQuery()){
			list = new ArrayList<Employe>();
			while (rs.next()) {
				Employe e = new Employe();
				e.setEno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setEadd(rs.getString(3));
				e.setEsal(rs.getInt(4));
				list.add(e);
			}
		}catch (Exception e) {
			System.out.println("EXC "+e.getMessage());
			throw e;
		}
		return list;
	}
		
}
