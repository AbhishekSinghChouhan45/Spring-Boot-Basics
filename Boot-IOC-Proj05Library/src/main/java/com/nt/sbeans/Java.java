package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("j")
public class Java implements IBooks {

	@Override
	public String book() {
		return "Java Book";
	}
	public Java() {
		System.out.println("Java");
	}
}
