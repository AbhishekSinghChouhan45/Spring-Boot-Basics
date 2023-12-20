package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.AmazoneFactory;

@SpringBootApplication
public class BootIocProj06ConfiguringXmLandPropertiesFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj06ConfiguringXmLandPropertiesFileApplication.class, args);
		AmazoneFactory amazon = ctx.getBean("af",AmazoneFactory.class);
		System.out.println(amazon.getCourier(new String[] {"Jeans,Shirt"}, new double[] {1000,700}));
		((ConfigurableApplicationContext) ctx).close();
	}

}
