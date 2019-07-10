package com.wcs.app.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.repository.ILedgerRepository;
import com.wcs.app.sb.main.repository.IProductRepository;

@Service
public class Serviceimpl implements IService {
	@Autowired
	ILedgerRepository ilr;
	@Autowired
	IProductRepository ip;

	@Override
	public Ledger addLedger(Ledger l) {
		Ledger l1 = ilr.save(l);
		return l1;
	}

	@Override
	public List<Ledger> getLedger() {
		List<Ledger> li = ilr.findAll();
		return li;
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		ip.save(p);
	}

	@Override
	public String getAllProductCode() {
		List<String> list = ip.getColoum();
		int max = 0;
		for (String p : list) {
			if (p != null) {
				String myIdString = p.substring(4);
				int myid = Integer.parseInt(myIdString);
				System.out.println(myid);
				if (myid > max) {
					max = myid;
				}
			}
		}
		if(max==0) {
			return "prob1001";
		}
		max++;
		System.out.println(max);
		return "prob"+max;

	}

}
