package com.wcs.app.sb.main.service;

import java.util.List;

import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.Product;

public interface IService {
	public Ledger addLedger(Ledger l);
	public List<Ledger> getLedger();
	public void addProduct(Product p);
	public String getAllProductCode();
}
