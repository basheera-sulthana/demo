package com.example.demo.UserController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
@RestController
public class UserController 
{
	@RequestMapping("/")
	   public String checkstatus()
	   {
		   return "hello world";
	   }
	@GetMapping
	@RequestMapping("/{name}")
	   public String welcome(@PathVariable String name)
	   {
		   return "hello    " + name;
	   }
	@RequestMapping("/")
	   public User create()
	   {
		   User user1=new User("female","Tanvi");
		   return user1;
	   }
	 //  @GetMapping(value="/",method=RequestMethod.PUT)
	   public User retrieveByName(String name)
	   {
		   User user=new User(name, name);
		   return user;
	   }
	
	}

