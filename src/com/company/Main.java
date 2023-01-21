
package com.company;


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
        System.out.println("Your EuroJackpot ticket");
        EuroJackpot euroJackpot = new EuroJackpot();
        euroJackpot.play();
        System.out.println("");
        System.out.println("Your Lotto ticket");
        Lotto lotto = new Lotto();
        lotto.play();
        System.out.println("");
        System.out.println("Your Fast600 Coupon ticket");
        Fast600 fast600 = new Fast600();
        fast600.play();


    }
}







