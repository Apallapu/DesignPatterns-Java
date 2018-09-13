/*******************************************************
 * copy right (c) ankamma ,All rights reserved
 * 
 * 
 * Application name :SingleTonWithDoubleCheckingLock
 * 
 * This application is used to managed the micro service development
 * 
 * 
 * File name:AccountContoller.java
 * 
 * File created Date:13 Sep, 2018
 * 
 ***********************************************************/
package com.test.singleton.controller;

import com.test.singleton.service.AccountService;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountContoller.
 */
public class AccountContoller {
	
	/** The account service. */
	//we have to apply autowire for service,instead of creating object
	AccountService accountService=new AccountService();
	
	/**
	 * Creates the controller.
	 */
	public void createController() {
		accountService.createService();
	}
	
	/**
	 * Update controller.
	 */
	public void updateController() {
		accountService.updateService();
	}
	
	/**
	 * Delete controller.
	 */
	public void deleteController() {
		accountService.deleteService();
	}
	
	/**
	 * Find all controller.
	 */
	public void findAllController() {
		accountService.findAllService();
	}

		
		
		
		
	

}
