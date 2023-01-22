
package com.company;


import java.util.Scanner;

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
                "  " +
                "                                                    d8' ");
        EuroJackpot euroJackpot = new EuroJackpot();
        Lotto lotto = new Lotto();
        Fast600 fast600 = new Fast600();
        for (int i = 0; i < 4; ) {

            System.out.println("\nHello in Lottery Office");
            System.out.println("What would you like to do:");
            System.out.println("1. Buy EuroJackpot ticket.");
            System.out.println("2. Buy Lotto ticket.");
            System.out.println("3. Buy Fast600 ticket.");
            System.out.println("4. Exit.\n");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            switch (input) {
                case "1":
                    System.out.println("\nYour EuroJackpot ticket");
                    euroJackpot.play();
                    break;
                case "2":
                    System.out.println("\nYour Lotto ticket");
                    lotto.play();
                    break;
                case "3":
                    System.out.println("\nYour Fast600 Coupon ticket");
                    fast600.play();
                    break;
                case "4":
                    i = 4;
                    break;
                default:
                    System.out.println("You chose the wrong option. Try again! \n");
            }

        }
    }
}







