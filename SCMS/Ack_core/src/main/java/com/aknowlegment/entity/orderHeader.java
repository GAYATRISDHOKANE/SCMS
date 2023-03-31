package com.aknowlegment.entity;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class orderHeader {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String userMob;
	private String userEmail;
	private Long purchaseOrderNumber;
	@CreationTimestamp
	private LocalDate purchseOrderDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ordId")
	private orderItems orderItems;
	@OneToOne(cascade = CascadeType.ALL)
	private address address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMob() {
		return userMob;
	}
	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		purchaseOrderNumber = purchaseOrderNumber;
	}
	public LocalDate getPurchseOrderDate() {
		return purchseOrderDate;
	}
	public void setPurchseOrderDate(LocalDate purchseOrderDate) {
		purchseOrderDate = purchseOrderDate;
	}
	public orderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(orderItems orderItems) {
		this.orderItems = orderItems;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "orderHeader [id=" + id + ", userName=" + userName + ", userMob=" + userMob + ", userEmail=" + userEmail
				+ ", PurchaseOrderNumber=" + purchaseOrderNumber + ", PurchseOrderDate=" + purchseOrderDate
				+ ", orderItems=" + orderItems + ", address=" + address + "]";
	}
	public orderHeader(Long id, String userName, String userMob, String userEmail, Long purchaseOrderNumber,
			LocalDate purchseOrderDate, com.aknowlegment.entity.orderItems orderItems,
			com.aknowlegment.entity.address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.userMob = userMob;
		this.userEmail = userEmail;
		purchaseOrderNumber = purchaseOrderNumber;
		purchseOrderDate = purchseOrderDate;
		this.orderItems = orderItems;
		this.address = address;
	}
	
	
	

}
