package com.example.testrun;

import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {

        Scanner fetch = new Scanner(System.in);
        int num = 0;
        int length = 0;
        try {
            System.out.println("enter first num");
            num = fetch.nextInt();
            System.out.println("enter length");
            length = fetch.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        method m1 = new method(num,length);
        System.out.println(m1.mainmethod());
    }

    }


