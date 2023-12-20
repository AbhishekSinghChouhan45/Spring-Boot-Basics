package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeController;
import com.nt.model.Employe;
@Component
public class Runners implements CommandLineRunner {
	@Autowired
	private EmployeController controller;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runners");
			try {
				List<Employe> list = controller.getEmploye();
				list.forEach(st->{
					System.out.println(st);
				});
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

}
