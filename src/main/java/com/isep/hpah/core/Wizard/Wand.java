package com.isep.hpah.core.Wizard;

import lombok.*;

import java.util.Random;

@Data
public class Wand {
    private String name;
    private double length;
    private String core;

    public Wand(String name, double length, String core) {
        this.name = generateRandomWandName();
        this.length = generateRandomWandLength();
        this.core = generateRandomWandCore();
    }

    public static String generateRandomWandName() {
        Random random = new Random();
        String[] wandNames = {"Wand of Destiny", "Wand of Power", "Wand of Wisdom"};
        return wandNames[random.nextInt(wandNames.length)];
    }

    public static double generateRandomWandLength() {
        Random random = new Random();
        double value =  8 + random.nextDouble() * 6; // Une taille de baguette entre 8 et 14 pouces
        double roundedValue = Math.round(value * 10) / 10.0;
        return roundedValue;
    }

    public static String generateRandomWandCore() {
        Random random = new Random();
        String[] wandCores = {"phoenix feather", "unicorn tail hair", "dragon heartstring"};
        return wandCores[random.nextInt(wandCores.length)];
    }

    public static Wand createWand() {
        System.out.println("""
                Let's head to the Diagon Alley to get you all the stuff you need!
                Ollivander welcomes you to his shop!
                
                He will now help you choose your wand.
                Huuum... I see... Your wand needs to be strong, but also flexible.
                I have just the thing for you!
                """);
        Wand wand = new Wand(generateRandomWandName(), generateRandomWandLength(), generateRandomWandCore());
        System.out.println("You received " + generateRandomWandName() + ", it as a length of " + generateRandomWandLength() + " inches and a " + generateRandomWandCore() + " core.");
        return wand;
    }

}