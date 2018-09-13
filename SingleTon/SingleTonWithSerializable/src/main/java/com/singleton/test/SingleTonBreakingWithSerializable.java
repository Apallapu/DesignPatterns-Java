package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingleTonBreakingWithSerializable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTonBreakingWithSerializable INSTANCE;

	private SingleTonBreakingWithSerializable() {
	}

	public static SingleTonBreakingWithSerializable getInstance() {
		if (INSTANCE == null) {
			synchronized (SingleTonBreakingWithSerializable.class) {
				if (INSTANCE == null)
					INSTANCE = new SingleTonBreakingWithSerializable();
			}
		}
		return INSTANCE;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingleTonBreakingWithSerializable INSTANCE = SingleTonBreakingWithSerializable.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accountDAO.ser"));
		oos.writeObject(INSTANCE);
		oos.close();

		// Here I am recreating the instance by reading the serialized object data store
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("accountDAO.ser"));
		SingleTonBreakingWithSerializable accountDAO = (SingleTonBreakingWithSerializable) ois.readObject();
		ois.close();

		// I am recreating the instance AGAIN by reading the serialized object data
		// store
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("accountDAO.ser"));
		SingleTonBreakingWithSerializable accountDAOtWO = (SingleTonBreakingWithSerializable) ois2.readObject();
		ois2.close();

		// Let's see how we have broken the singleton behavior
		System.out.println("first object reference check->" + accountDAO.getInstance());
		System.out.println("second object reference check->" + accountDAOtWO.getInstance());
		System.out.println("=========================================================");
		System.out.println("Real first object reference check->" + accountDAO);
		System.out.println("Real Second object reference check->" + accountDAOtWO);
	}
}