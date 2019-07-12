package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Invoice;

public interface IInvoiceRepository extends PagingAndSortingRepository<Invoice, Integer> {

}
