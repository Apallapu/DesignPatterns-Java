package com.ankamma.singleTon;

public class AccountRepository {

	private AccountRepository() {

	}

	private static class AccountSingleton {
		private static final AccountRepository instance = new AccountRepository();

	}

	public static AccountRepository getInstance() {
		return AccountSingleton.instance;
	}

	public void save() {

		System.out.println("save method called{}");
	}

	public void delete() {

		System.out.println("delete method called{}");
	}

	public void update() {

		System.out.println("update method called{}");
	}

}
