/*******************************************************
 * copy right (c) ankamma ,All rights reserved
 * 
 * 
 * Application name :SingleTonWithDoubleCheckingLock
 * 
 * This application is used to managed the micro service development
 * 
 * 
 * File name:AccountDaoSingleton.java
 * 
 * File created Date:13 Sep, 2018
 * 
 ***********************************************************/
package com.test.singleton.dao;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountDaoSingleton.
 */
public class AccountDaoSingleton {

	/** The instacce. */
	private static volatile AccountDaoSingleton instacce;

	/**
	 * Instantiates a new account dao singleton.
	 */
	private AccountDaoSingleton() {

	}

	/**
	 * Gets the single instance of AccountDaoSingleton.
	 *
	 * @return single instance of AccountDaoSingleton
	 */
	public static AccountDaoSingleton getInstance() {
		if (instacce == null) {
			synchronized (AccountDaoSingleton.class) {
				if (instacce == null) {
					instacce = new AccountDaoSingleton();
				}
			}
		}
		return instacce;
	}

	/**
	 * Creates the dao.
	 */
	public void createDao() {
		System.out.println("create dao");
	}

	/**
	 * Update dao.
	 */
	public void updateDao() {
		System.out.println("update dao");
	}

	/**
	 * Delete dao.
	 */
	public void deleteDao() {
		System.out.println("delete dao");
	}

	/**
	 * Find all.
	 */
	public void findAll() {
		System.out.println("findAll dao");
	}

}
