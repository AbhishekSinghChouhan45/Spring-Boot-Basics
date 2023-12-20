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
@Repository("oracle")
@Profile({"uat","prod"})
public class EmployeDAOOracle implements IEmployeDAO {
	private String GET_ALL_EMPLOYE_QUERY = "SELECT * FROM employe_data";
	private String GET_NAMED_EMPLOYE_QUERY = "SELECT * FROM employe_data WHERE employename = (?)";
	private String SET_EMPLOYE_QUERY = "INSERT INTO employe_data(employename,employeadd,employenumber,employedesignation,employesalary)VALUES(?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	@Override
	public List<Employe> getAllEmployes() throws SQLException, Exception {
			List<Employe> list = null;
			try(Connection con = ds.getConnection();
				  PreparedStatement ps = con.prepareStatement(GET_ALL_EMPLOYE_QUERY);
				  ResultSet rs = ps.executeQuery();){
				list = new ArrayList<Employe>();
				while (rs.next()) {
					Employe emp = new Employe();
					emp.setEID(rs.getInt(1));
					emp.setEName(rs.getString(2));
					emp.setEAdd(rs.getString(3));
					emp.setENumber(rs.getLong(4));
					emp.setEDesignation(rs.getString(5));
					emp.setESalary(rs.getDouble(6));
					list.add(emp);
				}
			}catch (SQLException e) {
				throw e;
			}catch (Exception e) {
				throw e;
			}
		return list;
	}

	@Override
	public List<Employe> getNamedEmployes(String name) throws SQLException, Exception {
		List<Employe> list = null;
		try(Connection con = ds.getConnection();
			  PreparedStatement ps = con.prepareStatement(GET_NAMED_EMPLOYE_QUERY);){
				ps.setString(1, name);
				try(ResultSet rs = ps.executeQuery();){
						list = new ArrayList<Employe>();
						while (rs.next()) {
							Employe emp = new Employe();
							emp.setEID(rs.getInt(1));
							emp.setEName(rs.getString(2));
							emp.setEAdd(rs.getString(3));
							emp.setENumber(rs.getLong(4));
							emp.setEDesignation(rs.getString(5));
							emp.setESalary(rs.getDouble(6));
							list.add(emp);
			          } //while
		        }//inner try
		}catch (SQLException e) {
			throw e;
		}catch (Exception e) {
			throw e;
		}
	return list;		
	}

	@Override
	public String setEmployes(String eName, String eAdd, Long eNumbers, String eDesignation, Double eSalary)throws SQLException, Exception {
			try(Connection con = ds.getConnection();
				  PreparedStatement ps = con.prepareStatement(SET_EMPLOYE_QUERY);){
					ps.setString(1, eName);
					ps.setString(2, eAdd);
					ps.setLong(3, eNumbers);
					ps.setString(4, eDesignation);
					ps.setDouble(5, eSalary);
					int count = ps.executeUpdate();
					if(count  > 0) {
					    return "Employe Registration Successfull in Oracle DB";
					}
			}catch (SQLException e) {
				throw e;
			}catch (Exception e) {
				throw e;
			}
		return "Employe Registration Unsuccessfull in Oracle DB";
	}
	public EmployeDAOOracle() {
		System.out.println("EmployeDAOOracle:: 0-param constructor");
	}
}
