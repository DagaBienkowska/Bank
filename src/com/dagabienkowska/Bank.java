package com.dagabienkowska;

public class Bank {

    public static void main(String[] args) {
        Personal accP1 = new Personal();

        accP1.openAcc("Maria", "Janik", "00123412344321432100009876");
        accP1.putCash();
        System.out.println(accP1.getAccNumber());
        accP1.withdraw();

        Business bsns1 = new Business();
        bsns1.openAcc("Józek", "Kowalski", "0098766789123443214567", "1234554321", "123451234");

    }
}
