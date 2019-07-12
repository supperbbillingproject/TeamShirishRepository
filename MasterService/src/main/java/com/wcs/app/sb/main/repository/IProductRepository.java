package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.sb.main.dto.ProductDto;
import com.wcs.app.sb.main.model.Product;
@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Integer>{
	public ProductDto findByProductcode(String productcode);
}
