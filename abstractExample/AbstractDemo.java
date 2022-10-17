package com.nc.training.abstractex;

abstract class LivingThing {
    public abstract void walk();
}
class Human extends LivingThing {
    @Override
    public void walk() {
        System.out.println("Human walks with two legs.");
    }
}
class Animal extends LivingThing {
    @Override
    public void walk() {
        System.out.println("Animal walks with four legs.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        LivingThing livingThing = new Human();
        livingThing.walk();

        livingThing = new Animal();
        livingThing.walk();
    }
}
