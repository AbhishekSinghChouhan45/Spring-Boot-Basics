package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("p")
public class Python implements IBooks {

	@Override
	public String book() {
		return "Python Book";
	}
	public Python() {
		System.out.println("Python");
	}
}
