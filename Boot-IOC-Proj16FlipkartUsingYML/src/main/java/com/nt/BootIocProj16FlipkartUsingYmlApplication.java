package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.FlipkartFactory;

@SpringBootApplication
public class BootIocProj16FlipkartUsingYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj16FlipkartUsingYmlApplication.class, args);
		FlipkartFactory ff = ctx.getBean("flipkart",FlipkartFactory.class);
		System.out.println(ff.getCourier(new String[] {"Jeans,Shirt"}, new double[] {950,600}));
		((ConfigurableApplicationContext) ctx).close();
	}

}
