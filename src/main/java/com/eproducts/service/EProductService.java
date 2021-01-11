package com.eproducts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eproducts.repo.EProductRepo;

import com.eproducts.model.EProducts;

@Service
public class EProductService {

	@Autowired
	private EProductRepo repo;
	
	public EProducts addProduct(EProducts product) {
	 EProducts addedProduct = 	repo.save(product);
		return addedProduct;
	}

	public EProducts findById(Integer productId) {
		EProducts product =  repo.findById(productId).orElse(null);
		return product;
	}

	public List<EProducts> findAllProducts() {
		List<EProducts> products = (List<EProducts>) repo.findAll();
		return products;
	}

	public void deleteProduct(Integer productId) {
		repo.deleteById(productId);
	}
	
	
}
