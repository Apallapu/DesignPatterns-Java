package com.test.singleton;

import java.io.Serializable;

public class SingletonWithReflectionSuccess implements Serializable {
	private static final long serialVersionUID = 3119105548371608200L;
	private static final SingletonWithReflectionSuccess singleton = new SingletonWithReflectionSuccess();

	private SingletonWithReflectionSuccess() {
	    if( SingletonWithReflectionSuccess.singleton != null ) {
	        throw new InstantiationError( "Creating of this object is not allowed." );
	    }
	}

	public static SingletonWithReflectionSuccess getInstance() {
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
			Class<SingletonWithReflectionSuccess> singletonClass = (Class<SingletonWithReflectionSuccess>) Class.forName("com.single.test.SingletonWithReflectionSuccess");
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
