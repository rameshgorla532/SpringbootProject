package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
	@GetMapping("/get")
	public ResponseEntity<String> showMsg()
	{
		return new ResponseEntity<String>("Hi Msg!",HttpStatus.OK);
	}

}
