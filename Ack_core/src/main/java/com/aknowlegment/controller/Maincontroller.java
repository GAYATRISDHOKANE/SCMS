package com.aknowlegment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aknowlegment.entity.AdDocuments;
import com.aknowlegment.entity.ProductInfo;
import com.aknowlegment.entity.orderHeader;
import com.aknowlegment.service.OrderService;
@RestController
public class Maincontroller {
	@Autowired
	private OrderService service;
	@PostMapping("/saveorder")
	public orderHeader saveOrder(@RequestBody orderHeader order) {
		orderHeader addorder = service.addorder(order);
		AdDocuments adDocument = service.ADdocumentsGenerateAndPersist(order);
		System.out.println(adDocument);
		return addorder;
		
	}
	@PostMapping("/saveProduct")
	public ProductInfo saveproduct(@RequestBody ProductInfo product) {
		ProductInfo addProduct = service.addProduct(product);
		return addProduct;
		
	}
	

}
