package com.example.testrun;

import java.io.Console;
import java.util.*;

public class TestRun {
    public static void main(String[] args) {
        Console console = System.console();
        Scanner fetch = new Scanner(System.in);
        rockpaperscissors r1 = new rockpaperscissors();



        System.out.println("Do you want to play with Player2 or AI?" + " Press A or B ");
        String ans = fetch.next();
        String newans = ans.toUpperCase();
        if(newans.equals("A")) {
            System.out.println("Player 1 - Enter your Option --> Rock, Paper or Scissors?");
            String player1temp = fetch.next();
            String player1 = player1temp.toUpperCase();
            System.out.println("Player 2 - Enter your Option --> Rock, Paper or Scissors?");
            String player2temp = fetch.next();
            String player2 = player2temp.toUpperCase();

            var g1 = new game(player1,player2);
            g1.Game();
        } else if(newans.equals("B")) {
            System.out.println("So you have choosen AI huh, Let's Get Started" + " Choose your play " + "Choose Rock/Paper/Scissors" + " BTW YOU ARE PLAYER 2");
            String player2temp = fetch.next();
            String player2 = player2temp.toUpperCase();
            String AIchoice = "";
            var g2 = new game(AIchoice,player2);
            g2.AIgame();
        }

    }

    }


