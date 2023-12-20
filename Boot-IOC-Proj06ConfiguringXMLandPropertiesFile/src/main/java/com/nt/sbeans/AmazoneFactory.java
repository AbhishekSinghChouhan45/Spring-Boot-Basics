package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component("af")
@ImportResource("com/nt/config/applicatioContext.xml")
public class AmazoneFactory {
	@Autowired
	@Qualifier("transport")
	private Courier courier;
	public String getCourier(String item[],double price[]) {
		double amt = 0.0;
		for(double prices:price) {
				amt = amt + prices;
		}
		int oid = new Random().nextInt(1000);
		return courier.getCourier(oid)+"\n Total amount: "+amt;
	}
}
