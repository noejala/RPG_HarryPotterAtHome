package com.isep.hpah.core.SortingHat;
import com.isep.hpah.core.Logic.LogicTxt;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SortingHat {

        public int SortingHatChoice() {
                LogicTxt lt = new LogicTxt();
                System.out.println("Welcome to Hogwarts! Before we can start your journey, we need to know which house you belong to.");
                int choice = lt.askInt("Which quality do you value the most ?" +
                        "\n1. Bravery" +
                        "\n2. Loyalty" +
                        "\n3. Creativity"+
                        "\n4. Ambition", 4);
                return choice;

        }


}