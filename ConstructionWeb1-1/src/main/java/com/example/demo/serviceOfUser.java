package com.example.demo;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class serviceOfUser {
	@Autowired
	ServiceRpo rep;
	public User getById(int id)
	{
		Optional<User> u1=rep.findById(id);
		User us=u1.get();
		return us;
	}
	public boolean UserNameValidation(String name)
	{
		Iterable<User> temp=rep.findAll();

		for(User t1:temp)
		{
			if(name.equals(t1.getName()))
			{
			return true;
			}
				
		}
		return false;
	}
	public boolean verfication(String name,String password)
	{ 	Iterable<User> temp=rep.findAll();
		if(name.isEmpty()||password.isEmpty())
			return false;
		for(User t2:temp)
		{
			if(t2.getName().equals(name)&&t2.getPassword().equals(password))
				return true;
		}
		
		return false;
	}

	

}
