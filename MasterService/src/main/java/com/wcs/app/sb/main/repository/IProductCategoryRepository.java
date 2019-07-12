package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.sb.main.model.ProductCategory;
@Repository
public interface IProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Integer>{


}
