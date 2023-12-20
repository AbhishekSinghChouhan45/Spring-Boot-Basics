package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cars")
@Scope("prototype")
public class CarsEngine {
	@Autowired
//	@Qualifier("pEngine")
	private IEngine engine;
	//B.logic
	public void getEngine(String start,String stop) {
		System.out.print(start+" ");engine.start();
		System.out.println("Journey is Going on");
		System.out.print(stop+" ");engine.stop();
		System.out.print("Total avg os engine is "+ engine.mileage());
	}
	public CarsEngine() {
		System.out.println("CarsEngine"); 
	}
}
