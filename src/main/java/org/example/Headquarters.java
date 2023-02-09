package org.example;

import classes.Villain;
import org.example.littlepackage.Partner;

public class Headquarters {
    public static void main(String[] args)
    {
        //Make a hero
        Hero hero = new Hero();
        hero.setName("Manolo");
        hero.setPower(59);

        System.out.println(hero.getName());
        System.out.println(hero.getPower());

        //Make a villain
        Villain villain = new Villain();

        //Make a partnership
        Partner partner = new Partner("");

    }
}