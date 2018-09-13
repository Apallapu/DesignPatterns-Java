package com.test.singleton.service;

import com.test.singleton.dao.AccountDaoSingleton;

public class AccountService {
	
	
	public void createService() {
		AccountDaoSingleton.INSTANCE.createDao();
	}
	public void updateService() {
		AccountDaoSingleton.INSTANCE.updateDao();
	}
	public void deleteService() {
		AccountDaoSingleton.INSTANCE.deleteDao();
	}
	public void findAllService() {
		AccountDaoSingleton.INSTANCE.findAll();
	}

	

}
