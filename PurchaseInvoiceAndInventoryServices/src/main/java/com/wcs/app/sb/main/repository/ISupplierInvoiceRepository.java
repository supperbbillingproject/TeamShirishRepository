package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.SupplierInvoice;

public interface ISupplierInvoiceRepository extends PagingAndSortingRepository<SupplierInvoice, Integer> {

}
