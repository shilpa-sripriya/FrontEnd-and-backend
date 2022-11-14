package com.registration.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.registration.entity.Tourist;
import com.registration.service.TouristService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/tourists")
public class TouristController {
	@Autowired
	private TouristService touristService;
	
	@RequestMapping("/getalltourists")
	public List<Tourist> getAllTourist(){
		return touristService.getAllTourists();
	}
	@RequestMapping(value="/registertourist",method=RequestMethod.POST)
	public boolean registerTourist(@RequestBody Tourist tourist) {
		return touristService.registerTourist(tourist);
	}
	 public List<Tourist> getAllTourists() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
