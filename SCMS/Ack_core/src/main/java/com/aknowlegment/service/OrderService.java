package com.aknowlegment.service;

import java.util.List;

import com.aknowlegment.entity.AdDocuments;
import com.aknowlegment.entity.ProductInfo;
import com.aknowlegment.entity.orderHeader;

import jakarta.persistence.criteria.Order;

public interface OrderService {
	
public orderHeader addorder(orderHeader Order);
	
	public List<Order>getAllorder();
	
	public orderHeader getOrderById(Integer orderId);
	
	public boolean deleteOrderById(Integer orderId );
	
	public ProductInfo addProduct(ProductInfo product);
	
	public AdDocuments ADdocumentsGenerateAndPersist(orderHeader order);

}
