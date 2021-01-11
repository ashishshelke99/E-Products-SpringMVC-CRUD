package com.eproducts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eproducts.model.EProducts;

@Repository
public interface EProductRepo extends CrudRepository<EProducts, Integer> {

	
	
}
