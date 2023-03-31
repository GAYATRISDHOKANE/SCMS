package com.aknowlegment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aknowlegment.entity.ProductInfo;
@Repository
public interface ProductInfoRepo extends JpaRepository<ProductInfo, Integer>{
 
	public ProductInfo findByproductNumber(Long proNumber);
}
