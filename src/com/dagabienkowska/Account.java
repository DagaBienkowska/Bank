package com.dagabienkowska;

import java.math.BigDecimal;
import java.util.Scanner;

abstract class Account {
    enum AccountType {
        PERSONAL,
        BUSINESS;

    }

    String name;
    String surname;
    String accNumber;
    BigDecimal accBalance;
    boolean isOpen = false;


    public Account(String name, String surname, String accNumber, boolean isOpen) {
        this.name = name;
        this.surname = surname;
        this.accNumber = accNumber;
        this.isOpen = isOpen;
    }

    public Account(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void openAcc(String name, String surname, String accNumber){
        setName(name);
        setSurname(surname);
        setAccNumber(accNumber);
        isOpen = true;
        System.out.println("Konto zostało otwarte");
        System.out.println("Dane konta: " +getName()+" "+getSurname()+
        " "+getAccNumber());

    };

    public void closeAcc(String name, String Surname, String accNumber){
        isOpen = false;
        System.out.println("Konto zostało zamknięte");
    };

    public void withdraw(){
        if (isOpen == false){
            System.out.println("Twoje konto jest zamknięte, nie można dokonać operacji");;
        } else {
            System.out.println("Podaj kwotę do wypłaty");
        }
    };

    public BigDecimal putCash(){
        if (isOpen == true){
            BigDecimal scanCash;
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj kwotę do wpłaty");
            scanCash = scan.nextBigDecimal();
            this.accBalance = scanCash;

        } else {
            System.out.println("Konto jest zamknięte, nie można wpłacić środków");;
        }
        return accBalance;
    };

    public BigDecimal getAccBalance() {
        return accBalance;
    }
}
