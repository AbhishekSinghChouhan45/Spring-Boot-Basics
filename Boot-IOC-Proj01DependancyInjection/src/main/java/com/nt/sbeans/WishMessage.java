package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("wmg")
public class WishMessage {
		private LocalDateTime time;
		@Autowired
		public void setTime(LocalDateTime time) {
			System.out.println("WishMessage.setTime()");
			this.time = time;
		}
	//Businness Logics
		public String genrateMessage(String name) {
			System.out.println("genrateMessage()");
			int hour = time.getHour();
			if(hour < 12)
				return "Good Morning "+name+" you'r learning Spring Boot";
			else if(hour < 16)
				return "Good Afternoon "+name+" you'r learning Spring Boot";
			else if(hour < 20)
				return "Good Evening "+name+" you'r learning Spring Boot";
			else
				return "Good Night "+name+" you'r will learn Spring Boot tommarow";
		}
		//Constructor
		public WishMessage() {
			System.out.println("WishMessage:: 0-param contructor");
		}
}
