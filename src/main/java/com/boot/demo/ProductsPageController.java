package com.boot.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProductsPageController {
	
	
	@RequestMapping("/products")
	public String getProducts(Model model)
	{
		model.addAttribute("title", "Products Master Data");
		
		String stockAndPriceUrl = "http://localhost:8022/getProducts";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<ProductData[]> resp = restTemplate.getForEntity(stockAndPriceUrl,ProductData[].class);
		
		System.out.println("resp from MS >> "+resp.getBody().length);
		
		model.addAttribute("products", resp.getBody());
		
		return "productListingPage";
	}
	

}
