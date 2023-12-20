package com.nt.model;

import lombok.Data;
/*This is Lombok api annotation which gives common logics automatically like Setters() and Getters(),Equals(),toString(),hashcode() to reduce
*	the burden on programmers 
*/
@Data 
public class Students { 
	private Integer Sno;
	private String Sname;
	private Integer Sclass;
	private Float Savg;
	private String result;
	
}
