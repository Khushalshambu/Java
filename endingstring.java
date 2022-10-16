package com.example.testrun;

import java.util.InputMismatchException;

public class endingstring {
    String str1;
    String str2;

    public boolean endOther(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int l1 = str1.length();
        int l2 = str2.length();
        try {
            if (str1.contains(str2)){
                for(int i = l1-l2;i <l1;i++){
                    for(int j=0;j<l2;j++) {
                        if(str1.charAt(i)==str2.charAt(j)){
                            return true;
                    }
                    }
                }
            }else if (str2.contains(str1)) {
                for(int i = l2-l1;i <l2;i++){ for(int j=0;j<l2;j++) {
                    if(str2.charAt(i)==str1.charAt(j)){
                        return true;
                    } }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("please enter the strings with atleast 3 characters in it");
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
        return false;}
}
