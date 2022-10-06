package com.example.testrun;

import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.println("Pass a string");
        String s = fetch.nextLine();
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
    }

    }


