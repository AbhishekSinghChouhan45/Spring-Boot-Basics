package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.spel.SpelEvaluationException;

import com.nt.sbeans.HotelHighway;

@SpringBootApplication
public class BootIocProj12SpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj12SpelApplication.class, args);
		HotelHighway hh = ctx.getBean("HH",HotelHighway.class);
		try {
		System.out.println(hh);
		}
		catch (SpelEvaluationException e) {
			System.out.println(e.getMessage());
		}
		}
}
