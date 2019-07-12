package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.ProductCategory;

public interface IProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Integer>{

}
