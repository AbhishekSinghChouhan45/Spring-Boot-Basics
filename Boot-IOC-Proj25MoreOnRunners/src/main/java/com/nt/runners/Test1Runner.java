package com.nt.runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class Test1Runner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("------------------Test2Runner AR1---------------");
			System.out.println("Non Optional Arguments: "+args.getNonOptionArgs());
			System.out.println("Optional Arguments: "+args.getOptionValues("name"));
			
			Set<String> lists = args.getOptionNames();
			List<String> list = null;
			for(String a:lists) {
				list = args.getOptionValues(a);
				System.out.println(list);
			}
	}

}
