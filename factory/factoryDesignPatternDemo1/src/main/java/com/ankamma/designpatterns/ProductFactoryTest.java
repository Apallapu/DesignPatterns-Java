package com.ankamma.designpatterns;

import com.ankamma.designpatterns.factory.ProductFactory;
import com.ankamma.designpatterns.model.ProductRequest;
import com.ankamma.designpatterns.product.ProductInfo;

/**
 * Hello world!
 *
 */
public class ProductFactoryTest 
{
    public static void main( String[] args )
    {
    	ProductFactory  productFactory=new ProductFactory();
    	ProductInfo productInfo =productFactory.getproduct("MOB");
    	ProductRequest productRequest=productInfo.getProducts("MOB");
    	
    	System.out.println("productRequest::: productId::" +productRequest.getProductId());
    }
}
