package com.ankamma.designpatterns.product;

import com.ankamma.designpatterns.model.ProductRequest;

public class MobleProduct implements ProductInfo {

	public ProductRequest getProducts(String productType) {
		ProductRequest productRequest = new ProductRequest();
		productRequest.setProductId(18l);
		productRequest.setProductName("Apple Iphone");
		productRequest.setProductPrice(100000.00);
		productRequest.setProductType(productType);
		return productRequest;
	}

}
