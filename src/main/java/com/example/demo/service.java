package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	repository rep1;
	
	public String delStudent(int id){
		
		rep1.deleteById(id);
		return "deleted";
	}
}
