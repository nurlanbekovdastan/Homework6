package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDomage(50);
        boss.setDeffence(100);
        boss.setSuperPower(120);
        System.out.println("Здоровья Босса:" + boss.getHealth());
        System.out.println("Урон от Босса:" + boss.getDomage());
        System.out.println("Сопротивляемость Босса:" + boss.getDeffence());
        System.out.println("Супер-урон Босса:" + boss.getSuperPower());

        System.out.println("");

        Warrior Darius = new Warrior();
        Darius.setHealth(200);
        Darius.setDomage(20);
        Darius.setDeffence(10);
        Darius.setSuperPower(70);
        System.out.println("Здоровья Дариуса:" + Darius.getHealth());
        System.out.println("Урон от Дариуса:" + Darius.getDomage());
        System.out.println("Сопротивляемость Дариуса:" + Darius.getDeffence());
        System.out.println("Супер-урон Дариуса:" + Darius.getSuperPower());

        System.out.println("");

        Magical Elen = new Magical();
        Elen.setHealth(150);
        Elen.setDomage(25);
        Elen.setDeffence(30);
        Elen.setSuperPower(200);
        System.out.println("Здоровья Элен:" + Elen.getHealth());
        System.out.println("Магический урон от Элен:" + Elen.getDomage());
        System.out.println("Магическая сопротивляемость Элен:" + Elen.getDeffence());
        System.out.println("Взрывной урон Элен:" + Elen.getSuperPower());

        System.out.println("");

        Mental merlin = new Mental();
        merlin.setHealth(150);
        merlin.setDomage(30);
        merlin.setDeffence(30);
        merlin.setSuperPower(100);
        System.out.println("Здоровья Мерлин:" + merlin.getHealth());
        System.out.println("Магический урон от Мерлин:" + merlin.getDomage());
        System.out.println("Магическая сопротивляемость Мерлин:" + merlin.getDeffence());
        System.out.println("Взрывной урон Мерлин:" + merlin.getSuperPower());

        }
    }

