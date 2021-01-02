package com.kspendli.concept.designpatterns.singleton;

import java.io.Serializable;

/*
* Prior to Java 5, java memory model had a lot of issues and the above approaches used to fail in certain scenarios
* where too many threads try to get the instance of the Singleton class simultaneously.
* So Bill Pugh came up with a different approach to create the Singleton class using an inner static helper class.
* The Bill Pugh Singleton implementation goes like this;
*
* Sometimes in distributed systems, we need to implement Serializable interface in Singleton class
* so that we can store its state in the file system and retrieve it at a later point of time.
* */
public class BillPughSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
