package com.aknowlegment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aknowlegment.entity.orderHeader;
import com.aknowlegment.service.Service;

@RestController
public class MainController {
	@Autowired
    private Service orderser;
	@PostMapping("/order")
	public ResponseEntity<orderHeader>saveorder(@RequestBody orderHeader order) {
		
		try {
			orderHeader addorder = orderser.addorder(order);
			return new ResponseEntity<>(addorder,HttpStatus.CREATED);
			
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
	}
}
