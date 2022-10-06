package com.example.testrun;

import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int i = 0;
        String[] ex = {};
        String connect = "true";
        var temp = 0;
        for(i = 0;i<ex.length;i++) {
            if(ex[i].equals(connect)) {
                temp += 1;
            }
        }
        System.out.println(temp);

    }

    }


