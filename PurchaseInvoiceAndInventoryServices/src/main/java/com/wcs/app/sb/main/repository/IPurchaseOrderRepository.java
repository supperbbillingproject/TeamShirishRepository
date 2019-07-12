package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.PurchaseOrder;

public interface IPurchaseOrderRepository extends PagingAndSortingRepository<PurchaseOrder, Integer> {

}
