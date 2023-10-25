package com.bridglabz;

public class NoPalyLadderSnake {
    public static void main(String[] args) {
         int NoPlay = 0;
         int Ladder = 1;
         int Snake = 2;
         int PlayerPosition = 0;

        int dieValue = (int) (Math.random() * 6) + 1;
        System.out.println("The Dice Value Is :" + dieValue);

        int option = (int) Math.floor(Math.random() * 10) % 3;

        if (option == 1) {
            PlayerPosition = PlayerPosition + dieValue;
            System.out.println("Climbing Ladder :" + PlayerPosition);
        } else if (option == 2) {
            if(PlayerPosition==0){
                System.out.println("Your Position is Zero");
            }
            else {
                PlayerPosition = PlayerPosition - dieValue;
                System.out.println("Snake Swollod :" + PlayerPosition);
            }
        } else {
            System.out.println("Your Position is :" + PlayerPosition);
        }
    }
}