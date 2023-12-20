package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Primary
public class Diesel implements IEngine {

	@Override
	public void start() {
			System.out.println("Diesel Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine Stopped");
	}

	@Override
	public float mileage() {
		return 66.90f;
	}
	//Constructor
	public Diesel() {
		System.out.println("Diesel Object Created");
	}

}
