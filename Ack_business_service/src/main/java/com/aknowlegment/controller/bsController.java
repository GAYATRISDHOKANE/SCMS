package com.aknowlegment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.aknowlegment.controller.service.service;
import com.aknowlegment.entity.orderHeader;

public class bsController {
	@Autowired
	private service Ser;
	@PostMapping("/save")
	public orderHeader home(@RequestBody orderHeader order) {
		Ser.saveOrder(order);
		return null;
	}

}
