package com.CaseStudy.adminservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.CaseStudy.adminservice.resources.AdminController;
import com.CaseStudy.trainservice.model.Trains;

@RestController
@RequestMapping("/admin")
public class HomeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	AdminController admin;
	
	@Autowired
	public HomeController(AdminController admin)
	{
		this.admin=admin;
	}
	
	@PostMapping
	public String add(@RequestBody Trains trains)
	{
		return admin.add(trains);
	}
	
	
	@GetMapping("/")
	public List<Trains> displayAll() //(@RequestBody Trains trains )                            //ResponseEntity<List> consume()
	{
		return admin.getTrains(); 
		
		
		
		//admin.display(trains);
		//return new ResponseEntity<>(admin.ConsumeApi(), HttpStatus.OK);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/")
//	public ResponseEntity<List> consume()
//	{
//		return new ResponseEntity<>(admin.ConsumeApi(), HttpStatus.OK);
//		
//	}
//	
//	
//	@PostMapping("/")
//	public ResponseEntity<List> getTrainsById(@PathVariable("id") String trainid) 
//	{    
//		return new ResponseEntity<>(admin.ConsumeApi1(),HttpStatus.OK);
//	}
//	

	
	
	
}
