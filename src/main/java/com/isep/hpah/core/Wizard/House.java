package com.isep.hpah.core.Wizard;
import java.util.Random;

import com.isep.hpah.core.SortingHat.SortingHat;
import lombok.Getter;
import lombok.Setter;
    @Getter
    @Setter
    public class House {
        private String name;
        Wizard wz;

        public House(String name) {
            this.name = name;
        }

        public static House houseSelection() {
            SortingHat sh = new SortingHat();
            int choice = sh.SortingHatChoice();
            switch (choice) {
                case 1:
                    System.out.println("Oh, I see... Gryffindor!");
                    System.out.println("You have been assigned to your house, Gryffindor !");
                    return new House("Gryffindor");
                case 2:
                    System.out.println("Oh, I see... Hufflepuff!");
                    System.out.println("You have been assigned to your house, Hufflepuff !");
                    return new House("Hufflepuff");
                case 3:
                    System.out.println("Oh, I see... Ravenclaw!");
                    System.out.println("You have been assigned to your house, Ravenclaw !");
                    return new House("Ravenclaw");
                case 4:
                    System.out.println("Oh, I see... Slytherin!");
                    System.out.println("You have been assigned to your house, Slytherin !");
                    return new House("Slytherin");
                default:
                    System.out.println("Pick a correct quality");
                    return null;
            }
        }

}




