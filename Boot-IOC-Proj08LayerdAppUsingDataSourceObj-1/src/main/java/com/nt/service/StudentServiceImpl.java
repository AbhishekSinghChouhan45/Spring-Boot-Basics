package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentsDAO;
import com.nt.model.Students;
@Service("studService")
public class StudentServiceImpl implements IStudentService {
	@Autowired	//Here we are getting object of IStudentDAO implementing sub class obj by providing specific Qualifier to prevent ambugity Exception
	@Qualifier("studDAO") 
	private IStudentsDAO dao;
	@Override //Overriding IStudentService interface methods 
	public List<Students> getStudentByName(String name) throws SQLException, Exception {
			List<Students> list = null;
			try{
				list = dao.getStudentByName(name); // Getting DAO list obj ref by using dao class obj
				for(Students st : list) { //Here we getting list objs in Student st 
					Float avg = st.getSavg(); 
					String result = null;
					if (avg < 35) {
						result = "Fail";
					}else if (avg >=35 && avg <=50 ) {
						result = "Pass with Second divison";
					}else if (avg >50 && avg <=70) {
						result ="Pass with First divison";
					}else {
						result ="Pass with Distinction";
					}
					st.setResult(result);
				}
			}catch (Exception e) {
//				e.printStackTrace();
				throw e; //Exception Propagation
			}
		return list; //return list 
	}
	public StudentServiceImpl() {
		System.out.println("StudentServiceImpl:: 0-param contructor");
	}
}
