package com.test.singleton;

import java.io.Serializable;

public class SingletonBreakingWithReflection implements Serializable {
	private static final long serialVersionUID = 3119105548371608200L;
	private static final SingletonBreakingWithReflection singleton = new SingletonBreakingWithReflection();

	private SingletonBreakingWithReflection() {

	}

	public static SingletonBreakingWithReflection getInstance() {
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton object can't be clone");
	}

	protected Object readResolve() {
		return singleton;
	}

	public static void main(String[] args) {

		try {
			Class<SingletonBreakingWithReflection> singletonClass = (Class<SingletonBreakingWithReflection>) Class
					.forName("com.single.test.SingletonWithReflectionFail");
			SingletonBreakingWithReflection singletonReflectionOne = singletonClass.newInstance();
			System.out.println("singletonReflectionOne:::" + singletonReflectionOne.hashCode());
			SingletonBreakingWithReflection singletonReflectionTwo = singletonClass.newInstance();
			System.out.println("singletonReflectionTwo:::" + singletonReflectionTwo.hashCode());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
