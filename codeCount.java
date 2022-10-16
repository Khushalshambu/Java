package com.example.testrun;

public class codeCount {
    String str;
    public int countCode(String str) {
    int j = 0;

        for(int i = 0;i<str.length()-3;i++) {
            if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e' ){
                j +=1;
            }
        }
        return j;}}


