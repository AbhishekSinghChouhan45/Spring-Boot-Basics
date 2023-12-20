package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Library;

@SpringBootApplication
public class BootIocProj05LibraryApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(BootIocProj05LibraryApplication.class, args);
		 Library l = ctx.getBean("library",Library.class);
		 System.out.println(l.getBook());
	}

}
