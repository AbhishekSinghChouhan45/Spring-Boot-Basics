package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component("s")
@Setter
@Getter
@ConfigurationProperties(prefix = "student")
public class Student {
	private String name;
	private String add;
	private String classs;
	private Float maths;
	private Float sceince;
	private Float socialsceince;
	private Float hindi;
	private Float sanskrit;
	@Override
	public String toString() {
		return "Student [name=" + name + ", \n add=" + add + ",\n classs=" + classs + ",\n maths=" + maths + ",\n sceince="
				+ sceince + ",\n socialsceince=" + socialsceince + ", \n hindi=" + hindi + ",\n sanskrit=" + sanskrit
				+ ",\n Avg=" +  (getMaths() + getHindi()+ getSocialsceince() +getSanskrit()+getSceince() / 500)  + "]";
	}
	
}
