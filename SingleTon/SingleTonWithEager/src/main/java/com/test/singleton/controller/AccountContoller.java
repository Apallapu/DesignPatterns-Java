package com.test.singleton.controller;

import com.test.singleton.service.AccountService;

public class AccountContoller {
	//we have to apply autowire for service,instead of creating object
	AccountService accountService=new AccountService();
	public void createController() {
		accountService.createService();
	}
	public void updateController() {
		accountService.updateService();
	}
	public void deleteController() {
		accountService.deleteService();
	}
	public void findAllController() {
		accountService.findAllService();
	}

		
		
		
		
	

}
