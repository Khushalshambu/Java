package com.example.testrun;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {

        Scanner fetch = new Scanner(System.in);
        var side = 0;
        try {
            System.out.println("enter side length");
            side = fetch.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please enter valid number");
            return;
        }catch(Exception e) {
            e.printStackTrace();
            return;
        }

        var t1 = new Sidesoftriangle(side);
        t1.findsides();
    }

    }


