package com.ankamma.designpatterns.product;

import com.ankamma.designpatterns.model.ProductRequest;

public class ElectronicProduct implements ProductInfo {

	

	public ProductRequest getProducts(String productType) {
		ProductRequest productRequest=new ProductRequest();
		productRequest.setProductId(12l);
		productRequest.setProductName("SAMSUNG TV");
		productRequest.setProductPrice(100000.00);
		productRequest.setProductType(productType);
		return productRequest;
	}

}
