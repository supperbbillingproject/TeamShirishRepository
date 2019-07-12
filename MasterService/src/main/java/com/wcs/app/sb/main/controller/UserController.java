package com.wcs.app.sb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.app.sb.main.dto.ProductDto;
import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.ProductCategory;
import com.wcs.app.sb.main.service.IService;

@RestController
@CrossOrigin("*")
/*@RequestMapping("/User")*/
public class UserController {
	@Autowired
	IService is;
	
	@RequestMapping(value="/")
	public String m1() {
		
		return "hello";
	}
	
	@RequestMapping(value="/ledger", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public Ledger addLedger(@RequestBody Ledger led)
	{
		Ledger ledger = is.addLedger(led);
		return ledger;
		
	}
	
	@RequestMapping(value="/ledger", method=RequestMethod.GET, consumes="application/json", produces="application/json")
	public List<Ledger> getLedger()
	{
		List<Ledger> li = is.getLedger();
		return li;
		
	}
	//to fetch product name in productPriceMapping
	@RequestMapping(value = "product/getproduct/{productcode}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public ProductDto getSingleProduct(@PathVariable String productcode) {
		
		ProductDto pd = is.getProduct(productcode);
		return pd;
	}
	//to add category
	@RequestMapping(value="product/addproductcategory", method=RequestMethod.POST, consumes="application/json")
	public ProductCategory addProductCategory(@RequestBody ProductCategory pc)
	
	{System.out.println("save");
	System.out.println(pc.getProductcategoryid());
		ProductCategory p = is.addCategory(pc);
		return p;
		
	}
}
