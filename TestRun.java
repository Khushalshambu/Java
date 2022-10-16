package com.example.testrun;

import java.io.Console;
import java.util.*;

public class TestRun {
    public static void main(String[] args) {
        String str = "hi";
        String s1 = "";
        for (int i = 0;i<str.length();i++){
        char c = str.charAt(i);
        s1 = s1 + c + c;
        }
        System.out.println(s1);
    }
}




