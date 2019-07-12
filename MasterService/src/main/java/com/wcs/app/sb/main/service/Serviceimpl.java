package com.wcs.app.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.sb.main.dto.ProductDto;
import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.ProductCategory;
import com.wcs.app.sb.main.repository.ILedgerRepository;
import com.wcs.app.sb.main.repository.IProductCategoryRepository;
import com.wcs.app.sb.main.repository.IProductRepository;

@Service
public class Serviceimpl implements IService{
	@Autowired
	ILedgerRepository ilr;
	@Autowired
	IProductRepository prepo;
	@Autowired
	IProductCategoryRepository pcr;
	@Override
	public Ledger addLedger(Ledger l) {
		Ledger l1 = ilr.save(l);
		return l1;
	}

	@Override
	public List<Ledger> getLedger() {
		List<Ledger>li = ilr.findAll();
		return li;
	}

	@Override
	public ProductDto getProduct(String productcode) {
		ProductDto product = prepo.findByProductcode(productcode);
		return product;

	}

	@Override
	public ProductCategory addCategory(ProductCategory pc) {
		// TODO Auto-generated method stub
		ProductCategory product=pcr.save(pc);
		return product;
	}
}