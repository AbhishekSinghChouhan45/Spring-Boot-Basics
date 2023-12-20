package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

//@ConfigurationProperties("cmp")
public class Company {
	private String name;
	private String add;
	private Integer size;
	private String ceo;
	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", add=" + add + ", size=" + size + ", ceo=" + ceo + "]";
	}
	public void setAdd(String add) {
		System.out.println("Company.setAdd()");
		this.add = add;
	}
	public void setSize(Integer size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}
	public void setCeo(String ceo) {
		System.out.println("Company.setCeo()");
		this.ceo = ceo;
	}
	public Company() {
		System.out.println("Company:: 0-param constructor");
	}
	
}
