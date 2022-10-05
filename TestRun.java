package com.example.testrun;

import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.println("enter number1");
        double number1 = fetch.nextDouble();
        System.out.println("enter number2");
        double number2 = fetch.nextDouble();

        calculator c1 = new calculator(number1,number2);
        System.out.println(c1.division());


    }

    }



