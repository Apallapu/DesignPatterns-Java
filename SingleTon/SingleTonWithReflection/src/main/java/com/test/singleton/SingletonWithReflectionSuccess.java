package com.test.singleton;

public class SingletonWithReflectionSuccess {

	private static final SingletonWithReflectionSuccess singleton = new SingletonWithReflectionSuccess();

	private SingletonWithReflectionSuccess() {
		if (SingletonWithReflectionSuccess.singleton != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static SingletonWithReflectionSuccess getInstance() {
		return singleton;
	}

	public static void main(String[] args) {

		try {
			Class<SingletonWithReflectionSuccess> singletonClass = (Class<SingletonWithReflectionSuccess>) Class
					.forName("com.test.singleton.SingletonWithReflectionSuccess");
			SingletonWithReflectionSuccess singletonReflectionOne = singletonClass.newInstance();
			System.out.println("singletonReflectionOne:::" + singletonReflectionOne.hashCode());
			SingletonWithReflectionSuccess singletonReflectionTwo = singletonClass.newInstance();
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
