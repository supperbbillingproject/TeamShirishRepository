package com.wcs.app.sb.main.service;

import java.util.List;

import com.wcs.app.sb.main.dto.ProductDto;
import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.ProductCategory;

public interface IService {
	public Ledger addLedger(Ledger l);
	public List<Ledger> getLedger();
	public ProductDto getProduct(String productcode);
	public ProductCategory addCategory(ProductCategory pc);
}
