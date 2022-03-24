package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.ProductConsumer;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private ProductConsumer consumer;
	
	@GetMapping("/get")
	public ResponseEntity<String> fetchData()
	{
		String data=consumer.getDataFromProduct();
		return new ResponseEntity<String>("Hello Order Controller"+data,HttpStatus.OK);
	}

}
