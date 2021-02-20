package com.kspendli.designpatterns.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args) {

        /*
        * In eager initialization, the instance of Singleton Class is created at the time of class loading,
        * this is the easiest method to create a singleton class
        * but it has a drawback that instance is created even though client application might not be using it.
        * */
        EagerInitializedSingleton o1 = EagerInitializedSingleton.getInstance();
        o1.sayHello();
        EagerInitializedSingleton o2 = EagerInitializedSingleton.getInstance();
        o2.sayHello();
        System.out.println("when we check two objects should be "+(o1==o2));

        /*
        * Static block initialization implementation is similar to eager initialization,
        * except that instance of class is created in the static block that provides option for exception handling.
        * */
        StaticBlockSingleton sb1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton sb2 = StaticBlockSingleton.getInstance();
        System.out.println("when we check two objects should be "+(sb1==sb2));

        LazyInitializedSingleton l1= LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton l2= LazyInitializedSingleton.getInstance();
        System.out.println("when we check two objects should be "+(l1==l2));

        /*
        * The easier way to create a thread-safe singleton class is to make the global access method synchronized,
        * or synchronized block so that only one thread can execute this method at a time.
        * General implementation of this approach is like the below class.
        * */
        ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
        System.out.println("when we check two objects should be "+(t1==t2));

        /*
        * This is the most widely used approach for Singleton class as it doesn’t require synchronization.
        * I am using this approach in many of my projects and it’s easy to understand and implement also.
        * */
        BillPughSingleton b1 = BillPughSingleton.getInstance();
        BillPughSingleton b2 = BillPughSingleton.getInstance();
        System.out.println("when we check two objects should be "+(b1==b2));


    }
}
