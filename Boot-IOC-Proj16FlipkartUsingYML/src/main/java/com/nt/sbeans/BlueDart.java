package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements ICourier {

	@Override
	public String getCourier(int oid) {
		return"Your order is shipped by BlueDart Courier services order id: "+oid;
	}

}
