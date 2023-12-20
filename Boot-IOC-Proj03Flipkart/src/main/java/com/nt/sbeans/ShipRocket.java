package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sr")
public class ShipRocket implements Courier{

	@Override
	public String getCourier(int oid) {
		return oid+" Your order is shipped by Ship Rocket courier service";
	}

}
