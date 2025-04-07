package com.lerning.joblisting.bean;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "jobpost")
public class Post {
	private String exp;
	private String desc;
	private String profile;
	private List<String> techs;
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public List<String> getTechs() {
		return techs;
	}
	public void setTechs(List<String> techs) {
		this.techs = techs;
	}
	public Post(String exp, String desc, String profile, List<String> techs) {
		super();
		this.exp = exp;
		this.desc = desc;
		this.profile = profile;
		this.techs = techs;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Post [exp=" + exp + ", desc=" + desc + ", profile=" + profile + ", techs=" + techs + "]";
	}
	
	

}
