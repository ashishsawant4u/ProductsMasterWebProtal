package com.boot.demo;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProductsPageController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProductsPageController.class);
	
	
	@Bean
	public RestTemplate template() {
	    return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/products")
	public String getProducts(Model model)
	{	
		LOG.info("inside PROTAL/getProducts...");
		
		model.addAttribute("title", "Products Master Data");
		
		String stockAndPriceUrl = "http://localhost:8022/prouctsMS/getProducts";
		
		
		ResponseEntity<ProductData[]> resp = restTemplate.getForEntity(stockAndPriceUrl,ProductData[].class);
		
		LOG.info("resp from MS >> "+resp.getBody().length);
		
		model.addAttribute("products", resp.getBody());
		
		return "productListingPage";
	}
	

}
