package com.nt.runner;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeController;
import com.nt.model.Employe;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private EmployeController controller;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println(sc == null);
			System.out.println("Press 1 to get All Employe data");
			System.out.println("Press 2 to get Named Employe data");
			System.out.println("Press 3 to Register Employe data");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:{
				List<Employe> list = null;
					list = controller.getEmploye();
					list.forEach(st->{
						System.out.println(st);
					});
					break;
			}
			case 2:{
				List<Employe> list = null;
				
				System.out.print("Enter Employe Name: ");
				String name = sc.nextLine();
				list = controller.getNamedEmploye(name);
				if (list.size() <= 0) {
					System.out.println("No Employe found of name: "+name);
				}
				list.forEach(st->{
					System.out.println(st);
				});
				break;
			}
			case 3:{
				System.out.print("Enter Employe Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Employe Address: "); 
				String add = sc.nextLine();
				System.out.print("Enter Employe Number: ");
				long number  = sc.nextLong(); sc.nextLine();
				System.out.print("Enter Employe Designation: ");
				String designation = sc.nextLine();
				System.out.print("Enter Employe Salary: ");
				double salary = sc.nextDouble();
				String msg = controller.setEmploye(name, add, number, designation, salary);
				System.out.println(msg);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}
		}catch (SQLException e) {
			System.out.println("E: "+e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("R: "+e.getMessage());
		}
	}

}
