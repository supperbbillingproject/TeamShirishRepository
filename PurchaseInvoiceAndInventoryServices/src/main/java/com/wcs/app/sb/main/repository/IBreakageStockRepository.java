package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.BreakageStock;

public interface IBreakageStockRepository extends PagingAndSortingRepository<BreakageStock, Integer> {

}
