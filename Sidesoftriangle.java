package com.example.testrun;

public class Sidesoftriangle {
    double side;



    public Sidesoftriangle(double side) {
        this.side = side;

    }
    public double findsides() {
        double sideone = 2 * side;
        System.out.println("The longest side of the given triangle is " + sideone);
        double sidetwo = side * Math.sqrt(3);
        System.out.println("The medium side of the given triangle is " + sidetwo);
        return sideone;
    }
}
