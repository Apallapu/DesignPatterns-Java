/*******************************************************
 * copy right (c) ankamma ,All rights reserved
 * 
 * 
 * Application name :SingleTonWithDoubleCheckingLock
 * 
 * This application is used to managed the micro service development
 * 
 * 
 * File name:AccountService.java
 * 
 * File created Date:13 Sep, 2018
 * 
 ***********************************************************/
package com.test.singleton.service;

import com.test.singleton.dao.AccountDaoSingleton;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountService.
 */
public class AccountService {
	
	
	/**
	 * Creates the service.
	 */
	public void createService() {
		AccountDaoSingleton.getInstance().createDao();
	}
	
	/**
	 * Update service.
	 */
	public void updateService() {
		AccountDaoSingleton.getInstance().updateDao();
	}
	
	/**
	 * Delete service.
	 */
	public void deleteService() {
		AccountDaoSingleton.getInstance().deleteDao();
	}
	
	/**
	 * Find all service.
	 */
	public void findAllService() {
		AccountDaoSingleton.getInstance().findAll();
	}

	

}
