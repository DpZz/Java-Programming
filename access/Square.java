package com.nc.training.access;

public class Square {

    public static void main(String[] args) {
        int area = calculateArea(20);
        System.out.println("Area is " + area);
    }

    public static int calculateArea(int length) {
        int area =0;
        area = length * length;
        return area;
    }
}
