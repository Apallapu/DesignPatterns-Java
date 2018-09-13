/*******************************************************
 * copy right (c) ankamma ,All rights reserved
 * 
 * 
 * Application name :SingleTonWithDoubleCheckingLock
 * 
 * This application is used to managed the micro service development
 * 
 * 
 * File name:UtilTest.java
 * 
 * File created Date:13 Sep, 2018
 * 
 ***********************************************************/
package com.test.singleton.util;

import com.test.singleton.controller.AccountContoller;

// TODO: Auto-generated Javadoc
/**
 * The Class UtilTest.
 */
public class UtilTest {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		AccountContoller accountContoller=new  AccountContoller();//we have to apply autowire for controller,instead of creating object
		accountContoller.createController();
		accountContoller.updateController();;
		accountContoller.deleteController();
		accountContoller.findAllController();
	}
}
