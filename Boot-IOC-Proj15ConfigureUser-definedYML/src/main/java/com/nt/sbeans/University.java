package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
@Component("university")
@Setter
@ConfigurationProperties(prefix = "un")
public class University {
		private String uName;
		private String uAdd;
		private Set<Long> uNumbers;
		private List<String> uBranches;
		private Map<String, Object> uStaff;
		private UniversityData ud;
// toString()
		@Override
		public String toString() {
			return "University [uName=" + uName + ", uAdd=" + uAdd + ", uNumbers=" + uNumbers + ", uBranches="
					+ uBranches + ", uStaff=" + uStaff.values() + ", ud=" + ud + "]";
		}
		
}
