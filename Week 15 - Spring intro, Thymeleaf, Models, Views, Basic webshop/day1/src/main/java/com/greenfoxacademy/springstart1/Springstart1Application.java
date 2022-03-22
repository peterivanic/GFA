package com.greenfoxacademy.springstart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Springstart1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springstart1Application.class, args);
	}

	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(){
		return "Hello world!";
	}
}
