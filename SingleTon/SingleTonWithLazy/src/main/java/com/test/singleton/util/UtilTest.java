package com.test.singleton.util;

import com.test.singleton.controller.AccountContoller;

public class UtilTest {
	public static void main(String[] args) {
		AccountContoller accountContoller=new  AccountContoller();//we have to apply autowire for service,instead of creating object
		accountContoller.createController();
		accountContoller.updateController();;
		accountContoller.deleteController();
		accountContoller.findAllController();
	}
}
