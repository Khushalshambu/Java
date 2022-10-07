package com.example.testrun;

import java.util.ArrayList;
import java.util.List;

public class method {
    int num;
    int length;

    public method(int num,int length) {
        this.num = num;
        this.length = length;
    }
    public double mainmethod(){
        double result1 = num * length;
        List<Integer> ex1 = new ArrayList<>();
        int i = 0;
        var temp = 0;
        for(i=1;i<=length; i++) {
            ex1.add(num*i);
        }
        System.out.println(ex1);
        return result1;
    }
}
