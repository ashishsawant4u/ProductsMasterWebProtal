package com.boot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsPageController {
	
	
	@RequestMapping("/products")
	public String getProducts(Model model)
	{
		model.addAttribute("title", "Products Master Data");
		
		return "productListingPage";
	}
	

}
