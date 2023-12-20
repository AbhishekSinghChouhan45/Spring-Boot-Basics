package com.nt.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("emp")
//@Data
@ConfigurationProperties(prefix = "emp")
public class Employe {
	private Integer id;
	private String empname;
	private String empadd;
	private String[] empnickname;
	private List<String> empfreind;
	private Set<Long> empphonunumber;
	private Map<String,Object> empids;
	private Company company;
	
@Override
	public String toString() {
		return "Employe [id=" + id + ", empname=" + empname + ", empadd=" + empadd + ", empnickname="
				+ Arrays.toString(empnickname) + ", empfreind=" + empfreind + ", empphonunumber=" + empphonunumber
				+ ", empids=" + empids + ", company=" + company + "]";
	}

public void setId(Integer id) {
	System.out.println("Employe.setId()");
		this.id = id;
	}

	public void setEmpname(String empname) {
		System.out.println("Employe.setEmpname()");
		this.empname = empname;
	}

	public void setEmpadd(String empadd) {
		System.out.println("Employe.setEmpadd()");
		this.empadd = empadd;
	}

	public void setEmpnickname(String[] empnickname) {
		System.out.println("Employe.setEmpnickname()");
		this.empnickname = empnickname;
	}

	public void setEmpfreind(List<String> empfreind) {
		System.out.println("Employe.setEmpfreind()");
		this.empfreind = empfreind;
	}

	public void setEmpphonunumber(Set<Long> empphonunumber) {
		System.out.println("Employe.setEmpphonunumber()");
		this.empphonunumber = empphonunumber;
	}

	public void setEmpids(Map<String, Object> empids) {
		System.out.println("Employe.setEmpids()");
		this.empids = empids;
	}

	public void setCompany(Company company) {
		System.out.println("Employe.setCompany()");
		this.company = company;
	}

	// Constructor
	public Employe() {
		System.out.println("Employe:: 0 -param constructor");
	}
}
