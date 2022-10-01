package com.example.testrun;

public class rectangle {
    static int sides = 2;
    double sideone;
    double sidetwo;

    public rectangle(double sideone, double sidetwo) {
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }
    public double findarea() {
        double area = sideone * sidetwo;
        return area;
    }
    public double findperimeter() {
        double perimeter = 2*(sideone+sidetwo);
        return perimeter;
    }
}
