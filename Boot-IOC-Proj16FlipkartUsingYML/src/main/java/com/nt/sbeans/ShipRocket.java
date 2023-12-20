package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sr")
public class ShipRocket implements ICourier {

	@Override
	public String getCourier(int oid) {
		return"Your order is shipped by ShipRocket Courier services order id: "+oid;
	}

}
