package com.example.testrun;

public class catanddog {
    String str;
    public boolean catDog(String str) {
        int j = 0;
        int k = 0;
        if(str.contains("cat") && str.contains("dog")){
            for(int i = 0;i<str.length()-2;i++) {
                if(str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t' ){
                    j +=1;
                }
            }            for(int i = 0;i<str.length()-2;i++) {
                if(str.charAt(i)=='d' && str.charAt(i+1)=='o' && str.charAt(i+2)=='g'){
                    k +=1;
                }
            }
            if(j==k){
                return true;
            }

        }
        return false;}
}
