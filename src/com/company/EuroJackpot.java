package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class EuroJackpot {
    private ArrayList<Integer> winningNumbers;
    private ArrayList<Integer> playerNumbers;
    private Random rand;

    public EuroJackpot() {
        this.winningNumbers = new ArrayList<>();
        this.playerNumbers = new ArrayList<>();
        this.rand = new Random();
    }

    public void play() {
        generateWinningNumbers();
        generatePlayerNumbers();
        Collections.sort(winningNumbers);
        Collections.sort(playerNumbers);
        System.out.println("Winning numbers: " + winningNumbers);
        System.out.println("Player numbers: " + playerNumbers);
        checkForWin();
    }

    private void generateWinningNumbers() {
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
    }

    private void generatePlayerNumbers() {
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
    }

    private void checkForWin() {
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
}