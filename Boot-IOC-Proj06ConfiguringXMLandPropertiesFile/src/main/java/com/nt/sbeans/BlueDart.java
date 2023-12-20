package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements Courier {

	@Override
	public String getCourier(int oid) {
		return oid+" Your Courier is shipped by BlueDart Courier Services";
	}

}
