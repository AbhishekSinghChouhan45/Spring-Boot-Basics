package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("factory")
public class FlipkartFactory {
	private Courier courier;
	@Autowired
	@Qualifier("ff")
	public void set(Courier courier) {
		System.out.println("FlipkartFactory.set()");
		this.courier = courier;
	}
	//Bussiness logics
	public String getCourier(String [] items,double []price) {
		double amt = 0.0f;
		for(double prices:price) {
			amt = prices + amt;
		}
		String msg = courier.getCourier(new Random().nextInt(1000));
		return msg+"\nTotal Amount: "+amt;
	}
}
