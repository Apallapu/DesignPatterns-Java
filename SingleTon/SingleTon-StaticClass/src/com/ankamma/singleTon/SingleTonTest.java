package com.ankamma.singleTon;

public class SingleTonTest {

	public static void main(String[] args) {
		AccountRepository instanceOne = AccountRepository.getInstance();
		System.out.println("first call with hashcode method:" + instanceOne.hashCode());
		/*
		 * AccountRepository.getInstance().save();
		 * AccountRepository.getInstance().delete();
		 * AccountRepository.getInstance().update();
		 */
		instanceOne.save();
		instanceOne.delete();
		AccountRepository instanceTwo = AccountRepository.getInstance();
		instanceTwo.update();

		System.out.println("second call with hashcode method:" + instanceTwo.hashCode());

	}

}
