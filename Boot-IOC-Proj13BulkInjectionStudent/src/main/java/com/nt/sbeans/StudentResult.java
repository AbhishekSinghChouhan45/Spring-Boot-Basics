package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sr")
public class StudentResult {
	@Autowired
	private Student st;
	@Override
	public String toString() {
		return st.toString();
	}
}
