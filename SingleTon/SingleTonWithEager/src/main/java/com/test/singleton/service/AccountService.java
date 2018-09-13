package com.test.singleton.service;

import com.test.singleton.dao.AccountDaoSingleton;

public class AccountService {
	
	
	public void createService() {
		AccountDaoSingleton.getInstance().createDao();
	}
	public void updateService() {
		AccountDaoSingleton.getInstance().updateDao();
	}
	public void deleteService() {
		AccountDaoSingleton.getInstance().deleteDao();
	}
	public void findAllService() {
		AccountDaoSingleton.getInstance().findAll();
	}

	

}
