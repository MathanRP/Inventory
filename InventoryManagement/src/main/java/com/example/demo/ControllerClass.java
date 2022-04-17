package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {	
	@Autowired
	ServiceClass sc;
	@GetMapping("/get")
	public List<Model> display()
	{
		System.out.println(sc.findAllMedicine());
		return sc.findAllMedicine();
	}
	@PostMapping("/add")
	public void adding(@RequestBody Model mv )
	{
		sc.add(mv);
	}
	@GetMapping("/get/{id}")
	public Model getmethod (@PathVariable int id)
	{
		
		return sc.getByid(id);
	}
	@DeleteMapping("/get/{id}")
	public void deleteModel(@PathVariable int id)
	{
		sc.delete(id);
		
	}

}
		

