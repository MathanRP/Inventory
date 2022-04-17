package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	@Autowired
	RepositoryInterface repo;
	public List<Model> findAllMedicine()
	{
		return repo.findAll();
	}
	public  void add(Model mv)
	{
		repo.save(mv);
	}
	public Model getByid(int id)
	{
		return repo.getById(id);
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}

}
