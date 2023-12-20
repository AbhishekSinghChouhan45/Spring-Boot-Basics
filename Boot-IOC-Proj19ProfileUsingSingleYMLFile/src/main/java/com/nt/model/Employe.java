package com.nt.model;

import lombok.Data;

@Data
public class Employe {
	private Integer eID;
	private String eName;
	private String eAdd;
	private Long eNumber;
	private String eDesignation;
	private Double eSalary;
	private Integer eAggression;
	public Employe() {
		System.out.println("Employe:: 0-param constructor");
	}
}
