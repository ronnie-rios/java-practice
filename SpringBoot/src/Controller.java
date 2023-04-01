package com.ronnie.daikichi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	//home route
	@RequestMapping("/daikichi")
	public String homeRoute() {
		return "Welcome";
	}
	
	@RequestMapping("/daikichi/today")
	public String todayRoute() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrowRoute() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/daikichi/travel/{travelLocation}")
	public String travelRoute(@PathVariable("travelLocation") String travelLocation) {
		return "Congratulations! You will soon travel to " + travelLocation;
	}
	
	@RequestMapping("/daikichi/lotto/{lotto}")
	public String lottoRoute(@PathVariable("lotto") Integer lottoNum) {
		if (lottoNum % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
	
}