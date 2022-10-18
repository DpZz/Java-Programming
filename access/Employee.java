package com.nc.training.access;

public abstract class Employee {


    private static final int retirementAge;

    static {
        retirementAge = 58;
    }


    public static int getRetirementAge() {
        return retirementAge;
    }

    public static void display() {
        System.out.println("Showing employee details!");
    }


}
