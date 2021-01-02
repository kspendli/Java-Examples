package com.kspendli.concept.oops;

interface BaseI{
    void method();
}
class BaseC{
    public void method(){
        System.out.println("Inside Basec");
    }
}
public class Inheritance extends BaseC implements BaseI{
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.method();
    }

}
