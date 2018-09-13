package com.singleton.test;

public class SingeltonBreakingWithClone implements Cloneable {

	private static SingeltonBreakingWithClone instance = null;

	private SingeltonBreakingWithClone() {
		System.out.println("Ankamma pallapu");
	}

	public static SingeltonBreakingWithClone getInstance() {

		if (instance == null) {
			instance = new SingeltonBreakingWithClone();
			return instance;
		}
		return instance;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		SingeltonBreakingWithClone test1 = SingeltonBreakingWithClone.getInstance();
		System.out.println("test1::::" + test1.hashCode());

		SingeltonBreakingWithClone test2 = (SingeltonBreakingWithClone) test1.clone();
		System.out.println("test2::::" + test2.hashCode());

	}

}
