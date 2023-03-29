package com.aknowlegment.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aknowlegment.Repository.AdddocumentRepo;
import com.aknowlegment.Repository.ProductInfoRepo;
import com.aknowlegment.Repository.orderHeaderRepository;
import com.aknowlegment.entity.AdDocuments;
import com.aknowlegment.entity.ProductInfo;
import com.aknowlegment.entity.orderHeader;
import com.aknowlegment.service.OrderService;

import jakarta.persistence.criteria.Order;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private orderHeaderRepository Repo;
	@Autowired
	private ProductInfoRepo productRepo;
	
	private  AdddocumentRepo AdDocument;

	@Override
	public orderHeader addorder(orderHeader Order) {
		orderHeader save = Repo.save(Order);
		return save;
	}
	
	@Override
	public ProductInfo addProduct(ProductInfo product) {
		ProductInfo productInfo = productRepo.save(product);
		return  productInfo ;
	}
	
	@Override
	public AdDocuments ADdocumentsGenerateAndPersist(orderHeader order) {
		AdDocuments adDocuments = new AdDocuments();
		ProductInfo storeProductInfo = productRepo.findByproductNumber(order.getOrderItems().getProductNumber());
		if( storeProductInfo.getProductQty()>=order.getOrderItems().getProductQty()) {
			adDocuments.setAcknowledgementsType("AD");
			adDocuments.setUserName(order.getUserName());
			adDocuments.setPurchaseOrderNumbers(order.getPurchaseOrderNumber());
			adDocuments.setOrderItems(order.getOrderItems());
			 AdDocument.save(adDocuments);
			
			
		}
		return  adDocuments;
	}
	

	@Override
	public List<Order> getAllorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public orderHeader getOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	
}
