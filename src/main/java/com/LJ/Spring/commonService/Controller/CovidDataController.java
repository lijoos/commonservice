package com.LJ.Spring.commonService.Controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.Spring.commonService.Dto.CovidDetail;
import com.LJ.Spring.commonService.Dto.GreetingDto;
import com.LJ.Spring.commonService.Dto.User;
import com.LJ.Spring.commonService.Service.UserRepository;
import com.LJ.Spring.commonService.ServiceImpl.CovidApiService;

@RestController
public class CovidDataController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	CovidApiService covidApiService;
	@GetMapping("/greeting")
	public CovidDetail greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		CovidDetail result= covidApiService.getCovidData();	
		User entity;
		//List <User> list=userRepository.findAll();
		return result;
	}

}
