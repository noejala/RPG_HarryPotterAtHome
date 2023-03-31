package com.isep.hpah.core.Wizard;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {



    private String name;

    static String[] pets={"Hedwig the snowy owl", "Scabbers the rat", "Crookshanks the cat", "Trevor the toad", "Fan the dog", "Buckbeak the hippogriff", "Errol the great gray owl"};
    public Pet(String name) {
        this.name = generateRandomPet();
    }

    public static String generateRandomPet(){
        int random = (int) (Math.random() * pets.length);
        return pets[random];
    }

    public static Pet createPet(){
        Pet pet = new Pet(generateRandomPet());
        System.out.println("""
                You are  nowheading to the Magical Menagerie to choose your pet.
                Between all these animals, one of them catches your eye.
                """);
        System.out.println("You choose to take home "  + generateRandomPet() + "!");
        return pet;
    }

}
