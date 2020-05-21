package com.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringBootController {
	@RequestMapping("/a")
	public String hello(){
		return "hello github";
	}
}
