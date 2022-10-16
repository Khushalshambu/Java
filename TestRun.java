package com.example.testrun;

import java.io.Console;
import java.util.*;

public class TestRun {
    public static void main(String[] args) {
        String str = "ashihihihi";
        int j = 0;
        for(int i = 0;i<str.length();i++) {
            if(str.length()>=2){
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                j += 1;
            } }
            else {
                System.out.println("please give string which consists of 2 chars");
        }
        System.out.println(j);
    }
} }




