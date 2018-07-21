package com.dagabienkowska;

import java.io.BufferedReader;

public class Business extends Account {

    String NIP;
    String REGON;
    public Business(String name, String surname, String accNumber, boolean isOpen){
        super(name, surname, accNumber, isOpen);
        this.NIP = NIP;
        this.REGON = REGON;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public void setREGON(String REGON) {
        this.REGON = REGON;
    }

    public Business(){};

    public void openAcc(String name, String Surname, String accNumber, String NIP, String REGON) {
        super.openAcc(name, Surname, accNumber);
        setNIP(NIP);
        setREGON(REGON);


    }
}
