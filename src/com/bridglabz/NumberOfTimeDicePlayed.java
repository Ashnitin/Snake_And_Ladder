package com.bridglabz;

public class NumberOfTimeDicePlayed {
    public static void main(String[] args) {
        int NoPlay = 0;
        int Ladder = 1;
        int Snake = 2;
        int PlayerPosition = 0;
        int dicePlayed=0;

        while (PlayerPosition<100) {
            int dieValue = (int) (Math.random() * 6) + 1;
            System.out.println("The Dice Value Is :" + dieValue);
            dicePlayed++;

            int option = (int) Math.floor(Math.random() * 10) % 3;

            if (option == 1) {
                if(PlayerPosition < 100 && (PlayerPosition+dieValue)<=100) {
                    PlayerPosition = PlayerPosition + dieValue;
                    System.out.println("Climbing Ladder :" + PlayerPosition);
                }
            } else if (option == 2) {
                if (PlayerPosition > 0 && (PlayerPosition-dieValue)>0) {
                    PlayerPosition = PlayerPosition - dieValue;
                    System.out.println("Snake Swollod :" + PlayerPosition);
                } else {
                    System.out.println("Your Position is On Zero No Play");
                }
            } else {
                System.out.println("Your Position is :" + PlayerPosition);
            }
        }
        System.out.println("Congratulations You Won");
        System.out.println("Number Of Time Dice Was Played To Win The Game: "+dicePlayed);
    }
}
