package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class Petrol implements IEngine {

	@Override
	public void start() {
			System.out.println("Petrol Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine Stopped");
	}

	@Override
	public float mileage() {
		return 45.6f;
	}
	//Constructor
	public Petrol() {
		System.out.println("Petrol Object Created");
	}

}
