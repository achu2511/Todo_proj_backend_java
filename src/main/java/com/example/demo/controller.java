package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	repository repo;
	
	@Autowired
	service ser;
	
	@GetMapping("/get")
	List<back> getList(){
		return repo.findAll();
	}
	
	@PostMapping("/post")
	public back create (@RequestBody back a) {
		return repo.save(a);
	}
	
	@DeleteMapping("/del")
	public String delete(@RequestParam int id) {
		return ser.delStudent(id);
	}
}
