package com.singleton.test;

public final class SingletonCloneSuccess implements Cloneable {

    
    private static SingletonCloneSuccess instance = null;

    private SingletonCloneSuccess() {
     System.out.println("Ankamma pallapu");
    }

    public static SingletonCloneSuccess getInstance() {

        if (instance == null) {
            instance = new SingletonCloneSuccess();
            return instance;
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

      
        throw new CloneNotSupportedException("SingleTon object can't be clone");
       
    }

    public static void main(String[] args) {
      
        SingletonCloneSuccess test1 = SingletonCloneSuccess.getInstance();

        try {
            SingletonCloneSuccess test2 = (SingletonCloneSuccess) test1.clone();
        } catch (CloneNotSupportedException e) {
          
            e.printStackTrace();
        }
    }

}
