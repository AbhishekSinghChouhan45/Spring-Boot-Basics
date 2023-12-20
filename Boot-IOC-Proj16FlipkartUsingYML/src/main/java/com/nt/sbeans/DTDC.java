package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier {

	@Override
	public String getCourier(int oid) {
		return"Your order is shipped by DTDC Courier services order id: "+oid;
	}
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}
}
