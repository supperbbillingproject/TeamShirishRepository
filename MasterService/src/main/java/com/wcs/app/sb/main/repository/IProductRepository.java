package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Product;

public interface IProductRepository extends PagingAndSortingRepository<Product, Integer>{
    @Query("SELECT u.productcode  FROM Product u")
    public List<String> getColoum();
}
