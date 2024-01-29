package com.sky.user;

public class UserDetails {
 //data members
	 private String name;
	 private String source;
	 private String destination;
	public UserDetails() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", source=" + source + ", destination=" + destination + "]";
	}
	 
	 
	
	
}
