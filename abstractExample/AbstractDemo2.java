package com.nc.training.abstractex;

abstract class Shape {
     abstract double calculateArea();

     public void setColor(String color) {
         String shape = "shape";
         if(this instanceof Circle) {
             shape = "circle";
         } else if(this instanceof Rectangle) {
             shape = "rectangle";
         }
         System.out.println("Colouring " + shape + " with " + color);
     }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius *radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Shape shape = new Circle(5.6);
        shape.setColor("Red");
        System.out.println("Circle area:" + shape.calculateArea());

        shape = new Rectangle(4.6, 3.4);
        shape.setColor("Blue");
        System.out.println("Rectangle area:" + shape.calculateArea());

    }
}
