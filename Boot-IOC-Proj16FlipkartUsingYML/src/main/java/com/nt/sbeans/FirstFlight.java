package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ff")
public class FirstFlight implements ICourier {

	@Override
	public String getCourier(int oid) {
		return"Your order is shipped by FirstFlight Courier services order id: "+oid;
	}

}
