package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class Electric implements IEngine {

	@Override
	public void start() {
			System.out.println("Electric Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Electric Engine Stopped");
	}

	@Override
	public float mileage() {
		return 60f;
	}
	//Constructor
	public Electric() {
		System.out.println("Electric Object Created");
	}

}
