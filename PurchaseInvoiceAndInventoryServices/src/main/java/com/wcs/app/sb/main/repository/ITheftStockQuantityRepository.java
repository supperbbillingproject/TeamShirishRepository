package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.TheftStockQty;

public interface ITheftStockQuantityRepository extends PagingAndSortingRepository<TheftStockQty, Integer> {

}
