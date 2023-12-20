package com.nt.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.nt.model.Students;
import com.nt.service.IStudentService;

@Controller("studController")
public class StudentController {
	@Autowired // Getting obj of IStudenService implementing class obj
	@Qualifier("studService")
	private IStudentService service;
	public List<Students> getStudentsByName(String name)throws SQLException,Exception{
			List<Students> list = null;
			try {
				list = service.getStudentByName(name);
			}catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
				throw e;
			}
			return list;
	}
	public StudentController() {
		System.out.println("StudentController:: 0-param contructor");
	}
}
