package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Component("h")
@Setter
@ConfigurationProperties(prefix = "hp")
public class Hospital {
	private String name;
	private String add;
	private Set<Long> numbers;
	private List<String> branches;
	private Map<String, Object> staff;
	private HospitalData hd;
	public Hospital() {
		System.out.println("Hospital.Hospital()");
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", add=" + add + ", numbers=" + numbers + ", branches=" + branches
				+ ", staff=" + staff.values() + ", hd=" + hd + "]";
	}
}
