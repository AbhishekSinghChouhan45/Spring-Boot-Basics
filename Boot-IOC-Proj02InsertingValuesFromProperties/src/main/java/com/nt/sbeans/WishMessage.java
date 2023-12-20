package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("wmg")
public class WishMessage {
	@Autowired
	private LocalDateTime time;
	//Constructor
	public WishMessage() {
		System.out.println("WishMessage.WishMessage()");
	}
	//Getting Value from properties file
	@Value("${per.name}")
	private String name;
	//Bussiness Logic
	public String genrateMessage(){
		int hour = time.getHour();
		if(hour < 12)
			return "Good Morning "+name;
		else if(hour <16)
			return "Good Afternoon "+name;
		else if(hour <20)
			return "Good Evening "+name;
		else
			return "Good Night "+name;
	}
	@PostConstruct
	public void init() {
		System.out.println("WishMessage.init()"); 
	}
	@PreDestroy
	private void destory() {
		System.out.println("WishMessage.destory()");
	}
	
}
