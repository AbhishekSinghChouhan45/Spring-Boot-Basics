package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier{

	@Override
	public String getCourier(int oid) {
		return oid+" Your order is shipped by DTDC courier service";
	}

}
