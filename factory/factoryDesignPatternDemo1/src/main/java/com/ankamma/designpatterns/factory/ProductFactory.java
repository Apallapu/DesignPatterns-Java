package com.ankamma.designpatterns.factory;

import com.ankamma.designpatterns.product.ElectronicProduct;
import com.ankamma.designpatterns.product.MobleProduct;
import com.ankamma.designpatterns.product.ProductInfo;

public class ProductFactory {

	public ProductInfo getproduct(String productType) {

		if (productType.equalsIgnoreCase("MOB")) {

			return new MobleProduct();
		} else if (productType.equalsIgnoreCase("ELE")) {
			return new ElectronicProduct();
		}

		return null;

	}

}
