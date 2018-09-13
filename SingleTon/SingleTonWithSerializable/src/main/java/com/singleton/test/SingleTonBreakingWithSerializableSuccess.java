package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleTonBreakingWithSerializableSuccess implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTonBreakingWithSerializableSuccess INSTANCE;

    private SingleTonBreakingWithSerializableSuccess() {  }

    public static SingleTonBreakingWithSerializableSuccess getInstance() {
        if (INSTANCE == null) {
            synchronized(SingleTonBreakingWithSerializableSuccess.class) {
                if(INSTANCE == null)
                    INSTANCE = new SingleTonBreakingWithSerializableSuccess();
            }
        }
        return INSTANCE;
    }
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    	SingleTonBreakingWithSerializableSuccess INSTANCE=SingleTonBreakingWithSerializableSuccess.getInstance();
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accountDAO.ser"));  
         oos.writeObject(INSTANCE);  
         oos.close();

         // Here I am recreating the instance by reading the serialized object data store
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("accountDAO.ser"));  
         SingleTonBreakingWithSerializableSuccess accountDAO = (SingleTonBreakingWithSerializableSuccess) ois.readObject();  
         ois.close();  

         // I am recreating the instance AGAIN by reading the serialized object data store
         ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("accountDAO.ser"));  
         SingleTonBreakingWithSerializableSuccess accountDAOtWO = (SingleTonBreakingWithSerializableSuccess) ois2.readObject();  
         ois2.close();

         // Let's see how we have broken the singleton behavior
         System.out.println("first object reference check->" +accountDAO.getInstance());
         System.out.println("second object reference check->" +accountDAOtWO.getInstance());
         System.out.println("=========================================================");
         System.out.println("Real first object reference check->" + accountDAO);
         System.out.println("Real Second object reference check->" + accountDAOtWO);
	}
}