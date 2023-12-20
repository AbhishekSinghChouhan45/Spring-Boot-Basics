package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("r")
public class Ruby implements IBooks {

	@Override
	public String book() {
		return "Ruby Book";
	}
	public Ruby() {
		System.out.println("Ruby");
	}
}
