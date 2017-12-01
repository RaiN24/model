package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class DemoApplication  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(DemoApplication.class);
	}

	@RequestMapping("/")
	public ModelAndView map(){
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
