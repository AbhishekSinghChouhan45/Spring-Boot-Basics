package com.nt.sbeans;

import java.util.Random;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("flipkart")
@ConfigurationProperties(prefix =  "couriers")
public class FlipkartFactory {
	private ICourier courier;
	public void setCourier(ICourier courier) {
		System.out.println("FlipkartFactory.setCourier()");
		this.courier = courier;
	}
	public String getCourier(String[] items,double[] price) {
		System.out.println(courier==null);
		Double amt = 0.0;
		for(Double prices: price) {
			amt = prices + amt;
		}
		int oid = new Random().nextInt(100);
//		return courier.getCourier(oid)+"\n Total payable amt: "+amt;
		return"sdf";
	}
}
