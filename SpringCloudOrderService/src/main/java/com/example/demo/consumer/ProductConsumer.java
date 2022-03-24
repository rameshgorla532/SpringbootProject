package com.example.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getDataFromProduct()
	{
		ServiceInstance si=client.choose("PROVIDER-SERVICE");
		String url=si.getUri()+"/provider/get";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> rs=rt.getForEntity(url, String.class);
		return  rs.getBody();
	}
	
	

}
