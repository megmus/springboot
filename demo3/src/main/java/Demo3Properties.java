package com.mome.demo;

import org.springframework.stereotype.*;
import org.springframework.boot.context.properties.*;

@Component
@ConfigurationProperties(prefix="demo3")
public class Demo3Properties {
	private String name;
	private String description;
	private String address;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
}