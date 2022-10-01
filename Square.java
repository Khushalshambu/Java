package com.example.testrun;

public class Square {
    static int sides = 2;
    double sideone;
    double sidetwo;

    public Square(double sideone, double sidetwo) {
        this.sideone = sideone;
        this.sidetwo = sidetwo;
        this.sides = sides;
    }
    public double findarea() {
        double area = Math.pow(sideone,2);
        if( sideone != sidetwo) {
            System.out.println("Square should have both sides equal");
        }
        else {  return area; }
        return area;
    }
    public double findperimeter() {
        double perimeter = 4 * sideone;
        if( sideone != sidetwo) {
            System.out.println("Square should have both sides equal");
        }
        else { System.out.println("The perimeter of square is"); }
        return perimeter;
    }
}
