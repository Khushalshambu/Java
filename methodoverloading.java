package com.company;
//Method Overloading
public class Test{
    void m1(int a){
        System.out.println("1-args");
    }
    void m1(int a,int b){
        System.out.println("2-args");
    }
    void m1(String s){
        System.out.println("string-args");
    }
    void m1(char ch){
        System.out.println("char-args");
    }
}
