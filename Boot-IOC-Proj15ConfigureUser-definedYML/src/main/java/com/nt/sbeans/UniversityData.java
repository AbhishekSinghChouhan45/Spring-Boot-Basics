package com.nt.sbeans;

import java.util.Map;

import lombok.Setter;
@Setter
public class UniversityData {
	private String ceoName;
	private Integer size;
	private Map<String, Object> secret;
	private Double turnover;
// toString()
	@Override
	public String toString() {
		return "UniversityData [ceoName=" + ceoName + ", size=" + size + ", secret=" + secret.values() + ", turnover=" + turnover
				+ "]";
	}
	
}
