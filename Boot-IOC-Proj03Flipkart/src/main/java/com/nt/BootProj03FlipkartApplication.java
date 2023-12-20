package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.FlipkartFactory;

@SpringBootApplication
public class BootProj03FlipkartApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(BootProj03FlipkartApplication.class, args);
	  FlipkartFactory fa = ctx.getBean("factory",FlipkartFactory.class);
	  String msg = fa.getCourier(new String[] {"Jeans,Shirts,Paints"}, new double[] {1250,780,700});
	  System.out.println(msg);
	}
	
}
