package com.twg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twg.entity.ContactMe;
import com.twg.repo.ContactMeRepo;

@Controller
@RequestMapping("/portfolio")
public class ContactMeController {

	
	
	@Autowired
	ContactMeRepo cmr;
	
	
	@PostMapping("/port")
	public String AddContactMe(@RequestParam String email, @RequestParam String message) {
		
		ContactMe cm= new ContactMe();
		cm.setEmail(email);
		cm.setMessage(message);
		
		 cmr.save(cm);
		 
		 return "NewFile";
	}
	
	@GetMapping("/home")
	public String home() {
		return"NewFile";
	}
}
