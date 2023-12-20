package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements Courier{

	@Override
	public String getCourier(int oid) {
		return oid+" Your order is shipped by Blue Dart courier service";
	}

}
