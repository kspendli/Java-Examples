package com.kspendli.designpatterns.factory;

public class ComputerFactory {

    /*
    * Factory Pattern Implementation
    * */
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);
        else
            return null;
    }

    /** Abstract Factory Implementation
     * */
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
