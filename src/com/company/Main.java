package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("");
        System.out.println("                                                                \n" +
                "88                                                              \n" +
                "88              ,d      ,d                                      \n" +
                "88              88      88                                      \n" +
                "88  ,adPPYba, MM88MMM MM88MMM ,adPPYba, 8b,dPPYba, 8b       d8  \n" +
                "88 a8\"     \"8a  88      88   a8P_____88 88P'   \"Y8 `8b     d8'  \n" +
                "88 8b       d8  88      88   8PP\"\"\"\"\"\"\" 88          `8b   d8'   \n" +
                "88 \"8a,   ,a8\"  88,     88,  \"8b,   ,aa 88           `8b,d8'    \n" +
                "88  `\"YbbdP\"'   \"Y888   \"Y888 `\"Ybbd8\"' 88             Y88'     \n" +
                "                                                       d8'      \n" +
                "                                                      d8' ");
        System.out.println("");
        System.out.println("Your random coupon for Eurojackpot ");
        System.out.println("");
        eurojackpot();
        System.out.println("");
        System.out.println("Your random coupon for Lotto ");
        System.out.println("");
        lotto();
        System.out.println("");
        System.out.println("Your random coupon for Fast600 ");
        System.out.println("");
        fast600();

    }

    public static void eurojackpot(){
        ArrayList<Integer> winningNumbers = new ArrayList<>();
        ArrayList<Integer> playerNumbers = new ArrayList<>();
        Random rand = new Random();

        // Generate 5 random winning numbers between 1 and 50
        while (winningNumbers.size() < 5) {
            int num = rand.nextInt(50) + 1;
            if (!winningNumbers.contains(num)) {
                winningNumbers.add(num);
            }
        }

        // Generate 2 random "Euro numbers" between 1 and 10
        while (winningNumbers.size() < 7) {
            int num = rand.nextInt(10) + 1;
            if (!winningNumbers.contains(num)) {
                winningNumbers.add(num);
            }
        }

        // Generate player numbers
        while (playerNumbers.size() < 5) {
            int num = rand.nextInt(50) + 1;
            if (!playerNumbers.contains(num)) {
                playerNumbers.add(num);
            }
        }
        while (playerNumbers.size() < 7) {
            int num = rand.nextInt(10) + 1;
            if (!playerNumbers.contains(num)) {
                playerNumbers.add(num);
            }
        }

        Collections.sort(winningNumbers);
        Collections.sort(playerNumbers);
        System.out.println("Winning numbers: " + winningNumbers);
        System.out.println("Player numbers: " + playerNumbers);

        // Check if player has won
        int matchingNumbers = 0;
        for (int i = 0; i < 5; i++) {
            if (winningNumbers.get(i) == playerNumbers.get(i)) {
                matchingNumbers++;
            }
        }
        int matchingEuroNumbers = 0;
        for (int i = 5; i < 7; i++) {
            if (winningNumbers.get(i) == playerNumbers.get(i)) {
                matchingEuroNumbers++;
            }
        }

        if (matchingNumbers == 5 && matchingEuroNumbers == 2) {
            System.out.println("Congratulations! You have won the EuroJackpot!");
        } else {
            System.out.println("Sorry, you did not win. You matched " + matchingNumbers + " numbers and " + matchingEuroNumbers + " Euro numbers.");
        }
    }

    public static void lotto(){
        ArrayList<Integer> winningNumbers = new ArrayList<>();
        ArrayList<Integer> playerNumbers = new ArrayList<>();
        Random rand = new Random();

        // Generate 5 random winning numbers between 1 and 50
        while (winningNumbers.size() < 6) {
            int num = rand.nextInt(49) + 1;
            if (!winningNumbers.contains(num)) {
                winningNumbers.add(num);
            }
        }


        // Generate player numbers
        while (playerNumbers.size() < 6) {
            int num = rand.nextInt(49) + 1;
            if (!playerNumbers.contains(num)) {
                playerNumbers.add(num);
            }
        }

        Collections.sort(winningNumbers);
        Collections.sort(playerNumbers);
        System.out.println("Winning numbers: " + winningNumbers);
        System.out.println("Player numbers: " + playerNumbers);

        // Check if player has won
        int matchingNumbers = 0;
        for (int i = 0; i < 6; i++) {
            if (winningNumbers.get(i) == playerNumbers.get(i)) {
                matchingNumbers++;
            }
        }


        if (matchingNumbers == 6) {
            System.out.println("Congratulations! You have won the Lotto!");
        } else {
            System.out.println("Sorry, you did not win. You matched " + matchingNumbers + " numbers");
        }
    }
    public static void fast600(){
        ArrayList<Integer> winningNumbers = new ArrayList<>();
        ArrayList<Integer> playerNumbers = new ArrayList<>();
        Random rand = new Random();

        // Generate 5 random winning numbers between 1 and 50
        while (winningNumbers.size() < 6) {
            int num = rand.nextInt(32) + 1;
            if (!winningNumbers.contains(num)) {
                winningNumbers.add(num);
            }
        }

        // Generate player numbers
        while (playerNumbers.size() < 6) {
            int num = rand.nextInt(32) + 1;
            if (!playerNumbers.contains(num)) {
                playerNumbers.add(num);
            }
        }

        Collections.sort(winningNumbers);
        Collections.sort(playerNumbers);
        System.out.println("Winning numbers: " + winningNumbers);
        System.out.println("Player numbers: " + playerNumbers);

        // Check if player has won
        int matchingNumbers = 0;
        for (int i = 0; i < 6; i++) {
            if (winningNumbers.get(i) == playerNumbers.get(i)) {
                matchingNumbers++;
            }
        }

        if (matchingNumbers == 6) {
            System.out.println("Congratulations! You have won the Fast600!");
        } else {
            System.out.println("Sorry, you did not win. You matched " + matchingNumbers + " numbers");
        }
    }
}





