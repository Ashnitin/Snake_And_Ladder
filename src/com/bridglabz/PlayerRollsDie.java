package com.bridglabz;

public class PlayerRollsDie {
    public static void main(String[] args) {
        //int playerPosition =0;
        //System.out.println("Player Position Is: "+playerPosition);
        int min = 1;
        int max = 6;
        int dieValue= (int) (Math.random()*(max-min+1) + min);
        System.out.println("Die Value Is: "+dieValue);

    }
}
