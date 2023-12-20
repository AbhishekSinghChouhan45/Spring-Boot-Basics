package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("t")
@PropertySource("application.properties")
public class Test {
	@Value("#{menu.dosa.price}")
	private Integer total;
	
	public Integer getTotal() {
		System.out.println("Test.getTotal() "+total);
		return total;
	}

	@Override
	public String toString() {
		return "Test [total=" + total + "]";
	}
	public Test() {
		System.out.println("Test.Test()");
	}
}
