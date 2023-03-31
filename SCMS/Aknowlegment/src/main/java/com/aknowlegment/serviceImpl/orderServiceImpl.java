package com.aknowlegment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.aknowlegment.entity.orderHeader;
import com.aknowlegment.service.Service;

public class orderServiceImpl implements Service {
	RestTemplate restTemp = new RestTemplate();
	@Autowired
	private Environment env;

	@Override
	public orderHeader addorder(orderHeader order) {
		String bsRoot = env.getProperty("api.bs.root");
		
		String url=bsRoot+"/save";
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<orderHeader>httpEntity = new HttpEntity<>(order,httpHeaders);
		ResponseEntity<orderHeader> response = restTemp.exchange(url, HttpMethod.POST,httpEntity,orderHeader.class);
		return response.getBody();
	}

}
