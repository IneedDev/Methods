package com.romaniuk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Game Over - true or false");
        boolean gameOver = sc.nextBoolean();

        System.out.println("Enter your score");
        int score = sc.nextInt();

        System.out.println("Enter completed level");
        int levelCompleted = sc.nextInt();

        System.out.println("Enter bonus");
        int bonus = sc.nextInt();

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);

        System.out.println("Final score is "+ highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted){
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore=finalScore+2000;
            return finalScore;
        }
        return -1;
    }

}
