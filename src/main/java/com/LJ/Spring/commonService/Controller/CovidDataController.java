package com.LJ.Spring.commonService.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.Spring.commonService.Dto.GreetingDto;

@RestController
public class CovidDataController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@GetMapping("/greeting")
	public GreetingDto greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GreetingDto(counter.incrementAndGet(), String.format(template, name));
	}

}
