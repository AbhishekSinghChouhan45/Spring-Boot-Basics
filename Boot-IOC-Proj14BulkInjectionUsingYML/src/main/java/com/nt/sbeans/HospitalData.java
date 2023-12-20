package com.nt.sbeans;

import java.util.Map;

import lombok.Setter;
import lombok.ToString;
@Setter
//@ToString
public class HospitalData {
	private String ceoname;
	private Integer size;
	private Map<String, Object> secret;
	private Double turnover;
	@Override
	public String toString() {
		return "HospitalData [ceoname=" + ceoname + ", size=" + size + ", secret=" + secret.values() + ", turnover=" + turnover
				+ "]";
	}
}
