package com.lti.hw.hwdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hwdemo {
	
	@GetMapping(path="/hw")
	public String hwDemo(){
		return "Hello OpenShift!!";
		
	}
}
