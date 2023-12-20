package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ff")
public class FirstFlight implements Courier {

	@Override
	public String getCourier(int oid) {
		return oid+" Your Courier is shipped by First FlightCourier Services";
	}

}
