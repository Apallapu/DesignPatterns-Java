package com.test.singleton.dao;

public class AccountDaoSingleton {
	
	private static AccountDaoSingleton instacce;
	
	private AccountDaoSingleton() {
		
	}
	public static AccountDaoSingleton getInstance() {
		if(instacce==null) {
			instacce=new AccountDaoSingleton();
		}
		return instacce;
	}
	
	public void createDao() {
		System.out.println("create dao");
	}
	public void updateDao() {
		System.out.println("update dao");
	}
	public void deleteDao() {
		System.out.println("delete dao");
	}
	public void findAll() {
		System.out.println("findAll dao");
	}

}
