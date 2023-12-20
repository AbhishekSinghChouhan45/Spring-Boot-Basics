package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class Test2Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------------------Test1Runner CLR1--------------------------");
		System.out.println("Non Optional Arguments: ");
		for(String s:args) {
			System.out.println(s);
		}
	}

}
