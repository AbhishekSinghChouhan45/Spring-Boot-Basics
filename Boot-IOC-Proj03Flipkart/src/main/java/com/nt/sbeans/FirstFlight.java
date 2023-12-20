package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ff")
public class FirstFlight implements Courier{

	@Override
	public String getCourier(int oid) {
		return oid+" Your order is shipped by First Flight courier service";
	}

}
