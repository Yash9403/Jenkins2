package com.main.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	
	@GetMapping("/{name}")
	public String returnMessage(@PathVariable String name)
	{
		return name+ " Good Morning!";
	}

}
