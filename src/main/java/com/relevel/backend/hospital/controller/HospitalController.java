package com.relevel.backend.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

