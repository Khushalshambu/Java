package com.example.testrun;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        try {
            System.out.println("enter number 1");
            number1 = fetch.nextDouble();
            System.out.println("enter number 2");
            number2 = fetch.nextDouble();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("please enter valid input");
            return;
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("please enter valid input");
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("please enter valid input");
            return;
        }
        String input = null;
        try {
            System.out.println("enter a process you want to perform among +-*/");
            input = fetch.next();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("please enter valid input");
            return;
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("please enter valid input");
            return;
        }catch (Exception e) {
            e.printStackTrace();
            return;
        }

        switch(input){
            case "+":
                var v = number1 + number2;
                System.out.println(v);
                break;
            case "-": var v2 = number1 - number2;
                System.out.println(v2);
                break;
            case "*": var v3 = number1*number2;
                System.out.println(v3);
                break;
            case "/": var v4 = number1/number2;
                System.out.println(v4);
                break;
                default:
                    System.out.println("please enter valid input");

    }

    } }



