package org.example;

public class Hero {

    private String name;
    private int power;

    public Hero() {
    }

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String greet(String name) {
        return ("Te vencere " + name);
    }

    //Special Methods GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 100 || power <= 0) {
            System.out.println("El poder debe estar entre 0 y 100.");
            this.power = 0;
        } else {
            this.power = power;
        }
    }


//    public String getName() {
//        String name = this.name;
//        return name;
//    }
//
//    public String setName() {
//
//    }
}
