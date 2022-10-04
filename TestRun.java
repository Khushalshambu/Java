package com.example.testrun;

import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {

        Scanner sent = new Scanner(System.in);
        System.out.println("enter a word");
        String s = sent.nextLine();
        System.out.println("enter another word");
        String f = sent.nextLine();

        char t[] = s.toCharArray();
        char u[] = f.toCharArray();

        Arrays.sort(t);
        Arrays.sort(u);

        if(Arrays.equals(t,u)) {
            System.out.println("true"); } else {
            System.out.println("false"); }
    } }



