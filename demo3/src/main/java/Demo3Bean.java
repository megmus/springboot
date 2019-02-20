package com.mome.demo;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Demo3Bean {
	
	@Value("$(name)")
	private String name;
	
	public Demo3Bean(){
		System.out.println("name: " + this.name);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
	
	