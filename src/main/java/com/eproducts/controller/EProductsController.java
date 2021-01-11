package com.eproducts.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eproducts.model.EProducts;
import com.eproducts.service.EProductService;

@Controller
public class EProductsController {
	
	@Autowired
	private EProductService productService;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(EProducts product) {
		ModelAndView mv = new ModelAndView("added.jsp");
		product.setCreatedDate(LocalDateTime.now());
		EProducts addedProduct =  productService.addProduct(product);
		mv.addObject("addedProduct", addedProduct);
		return mv;
	}

	@RequestMapping(value = "/findById")
	public ModelAndView findById(@RequestParam Integer productId) {
		ModelAndView mv = new ModelAndView("showProduct.jsp");
		EProducts fetchedProduct =  productService.findById(productId);
		mv.addObject("fetchedProduct", fetchedProduct);
		return mv;
	}
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public ModelAndView findAllProducts() {
		ModelAndView mv = new ModelAndView("showAllProducts.jsp");
		List<EProducts> allProducts = productService.findAllProducts();
		mv.addObject("allProducts", allProducts);
		return mv;
	}
	
	@RequestMapping(value = "/updateProduct")
	public ModelAndView updateProduct(@RequestParam Integer productId, EProducts product) {
		ModelAndView mv = new ModelAndView("updateProduct2.jsp");
		EProducts updatedProduct =  productService.addProduct(product);
		 mv.addObject("updatedProduct", updatedProduct);
		 return mv;
	}
	
	@RequestMapping(value = "/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam Integer productId) {
		ModelAndView mv = new ModelAndView("deleteProduct.jsp");
		productService.deleteProduct(productId);
		mv.addObject("productId", productId);
		return mv;
	}
	
}
