package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("library")
public class Library {
	@Autowired
	@Qualifier("j")
	private IBooks book;
	//b.logic
	public String getBook() {
		return "Student wants "+book.book();
	}
	public Library() {
		System.out.println("Library");
	}
}
