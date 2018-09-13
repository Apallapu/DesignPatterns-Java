package com.test.singleton.dao;

public enum AccountDaoSingleton {

	INSTANCE;

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
