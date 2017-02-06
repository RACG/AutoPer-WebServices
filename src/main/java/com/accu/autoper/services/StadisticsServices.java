package com.accu.autoper.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stadistics")
public class StadisticsServices {

	@RequestMapping("/test")
	public String test() {
		return "This is a test for reaching the services";
	}

}
