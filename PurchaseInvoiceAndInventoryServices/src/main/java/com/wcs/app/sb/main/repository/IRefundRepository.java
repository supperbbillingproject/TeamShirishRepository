package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Refund;

public interface IRefundRepository extends PagingAndSortingRepository<Refund, Integer> {

}
