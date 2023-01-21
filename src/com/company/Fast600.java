package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Fast600 {
    private ArrayList<Integer> winningNumbers;
    private ArrayList<Integer> playerNumbers;
    private Random rand;

    public Fast600() {
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
        // Generate 6 random winning numbers between 1 and 32
        while (winningNumbers.size() < 6) {
            int num = rand.nextInt(32) + 1;
            if (!winningNumbers.contains(num)) {
                winningNumbers.add(num);
            }
        }
    }

    private void generatePlayerNumbers() {
        // Generate player numbers
        while (playerNumbers.size() < 6) {
            int num = rand.nextInt(32) + 1;
            if (!playerNumbers.contains(num)) {
                playerNumbers.add(num);
            }
        }

    }

    private void checkForWin() {
        // Check if player has won
        int matchingNumbers = 0;
        for (int i = 0; i < 6; i++) {
            if (winningNumbers.get(i) == playerNumbers.get(i)) {
                matchingNumbers++;
            }
        }
        if (matchingNumbers == 6) {
            System.out.println("Congratulations! You have won the EuroJackpot!");
        } else {
            System.out.println("Sorry, you did not win Fast600. You matched " + matchingNumbers + " numbers ");
        }
    }
}
