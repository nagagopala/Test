package com.learning.SpringJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Programmer {
	private String progammerName;
	private String progammerId;
	private String progammerLanguage;
	public String getProgammerName() {
		return progammerName;
	}
	public void setProgammerName(String progammerName) {
		this.progammerName = progammerName;
	}
	public String getProgammerId() {
		return progammerId;
	}
	public void setProgammerId(String progammerId) {
		this.progammerId = progammerId;
	}
	public String getProgammerLanguage() {
		return progammerLanguage;
	}
	public void setProgammerLanguage(String progammerLanguage) {
		this.progammerLanguage = progammerLanguage;
	}
	public Programmer(String progammerName, String progammerId, String progammerLanguage) {
		super();
		this.progammerName = progammerName;
		this.progammerId = progammerId;
		this.progammerLanguage = progammerLanguage;
	}
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Programmer [progammerName=" + progammerName + ", progammerId=" + progammerId + ", progammerLanguage="
				+ progammerLanguage + "]";
	}
	

}
