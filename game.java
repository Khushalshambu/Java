package com.example.testrun;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class game  {
    String player1;
    String player2;

    public game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    rockpaperscissors r1 = new rockpaperscissors();
    public String Game() {
        if(player1.equals(r1.rock) || player2.equals(r1.paper)) {
            System.out.println("player two wins"); }
        else if(player1.equals(r1.rock) || player2.equals(r1.scissors)) {
            System.out.println("player one wins"); }
        else if(player1.equals(r1.rock) || player2.equals(r1.rock)) {
            System.out.println("Tie"); }

        else if(player1.equals(r1.paper) || player2.equals(r1.rock)) {
            System.out.println("player one wins"); }
        else if(player1.equals(r1.paper) || player2.equals(r1.paper)) {
            System.out.println("tie"); }
        else if(player1.equals(r1.paper) || player2.equals(r1.scissors)) {
            System.out.println("player two wins"); }

        else if(player1.equals(r1.scissors) || player2.equals(r1.rock)) {
            System.out.println("player two wins"); }
        else if(player1.equals(r1.scissors) || player2.equals(r1.paper)) {
            System.out.println("player one wins"); }
        else if(player1.equals(r1.scissors) || player2.equals(r1.scissors)) {
            System.out.println("Tie"); }

        else if(!player1.equals(r1.paper) || !player1.equals(r1.rock) || !player1.equals(r1.scissors)) {
            System.out.println("please enter valid input"); }
            else if(!player2.equals(r1.paper) || !player2.equals(r1.rock) || !player2.equals(r1.scissors)) {
            System.out.println("please enter valid input"); }

        return player1;
    }
    public String AIgame() {
        List<String> rps =new ArrayList<String>();
        rps.add("Rock");
        rps.add("Paper");
        rps.add("Scissors");

        Random rand = new Random();
        int i = rand.nextInt(rps.size());
        String AIchoice = rps.get(i);

        if(AIchoice.equals(r1.rock) || player2.equals(r1.paper)) {
            System.out.println("player two wins"); }
        else if(AIchoice.equals(r1.rock) || player2.equals(r1.scissors)) {
            System.out.println("player one wins"); }
        else if(AIchoice.equals(r1.rock) || player2.equals(r1.rock)) {
            System.out.println("Tie"); }

        else if(AIchoice.equals(r1.paper) || player2.equals(r1.rock)) {
            System.out.println("player one wins"); }
        else if(AIchoice.equals(r1.paper) || player2.equals(r1.paper)) {
            System.out.println("tie"); }
        else if(AIchoice.equals(r1.paper) || player2.equals(r1.scissors)) {
            System.out.println("player two wins"); }

        else if(AIchoice.equals(r1.scissors) || player2.equals(r1.rock)) {
            System.out.println("player two wins"); }
        else if(AIchoice.equals(r1.scissors) || player2.equals(r1.paper)) {
            System.out.println("player one wins"); }
        else if(AIchoice.equals(r1.scissors) || player2.equals(r1.scissors)) {
            System.out.println("Tie"); }

        else if(!AIchoice.equals(r1.paper) || !AIchoice.equals(r1.rock) || !AIchoice.equals(r1.scissors)) {
            System.out.println("please enter valid input"); }
        else if(!player2.equals(r1.paper) || !player2.equals(r1.rock) || !player2.equals(r1.scissors)) {
            System.out.println("please enter valid input"); }


        return "";

    }


}
