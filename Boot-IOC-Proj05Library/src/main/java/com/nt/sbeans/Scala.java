package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("s")
public class Scala implements IBooks {

	@Override
	public String book() {
		return "Scala Book";
	}
	public Scala() {
		System.out.println("Scala");
	}
}
