package com.test.singleton;

public class SingletonBreakingWithReflection {
	
	private static final SingletonBreakingWithReflection singleton = new SingletonBreakingWithReflection();

	private SingletonBreakingWithReflection() {

	}

	public static SingletonBreakingWithReflection getInstance() {
		return singleton;
	}

	public static void main(String[] args) {

		try {
			Class<SingletonBreakingWithReflection> singletonClass = (Class<SingletonBreakingWithReflection>) Class
					.forName("com.test.singleton.SingletonBreakingWithReflection");
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
