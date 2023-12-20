package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CNG implements IEngine {

	@Override
	public void start() {
			System.out.println("CNG Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("CNG Engine Stopped");
	}

	@Override
	public float mileage() {
		return 75.37f;
	}
	//Constructor
	public CNG() {
		System.out.println("CNG Object Created");
	}

}
