package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf {
    public static void main(String[] args){
        Car Auto= new Car("rot", 5, 10000);

        Auto.currentSpeed();

        System.out.println(Auto.accelerate(50.0));
        System.out.println(Auto.slowdown(50.0));
    }
}
