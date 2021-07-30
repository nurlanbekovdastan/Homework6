package com.company;

public abstract class PLAYER {

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDomage() {
        return Domage;
    }

    public void setDomage(int domage) {
        Domage = domage;
    }

    public int getDeffence() {
        return Deffence;
    }

    public void setDeffence(int deffence) {
        Deffence = deffence;
    }

    public int getSuperPower() {
        return SuperPower;
    }

    public void setSuperPower(int superPower) {
        SuperPower = superPower;
    }

    private int Health;
    private int Domage;
    private int Deffence;
    private int SuperPower;


    }

