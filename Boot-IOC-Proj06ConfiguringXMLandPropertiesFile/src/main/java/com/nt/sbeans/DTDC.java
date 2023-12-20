package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public String getCourier(int oid) {
		return oid+" Your Courier is shipped by DTDC Courier Services";
	}

}
