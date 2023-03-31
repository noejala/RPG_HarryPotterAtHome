package com.isep.hpah.core.Wizard;
 import com.isep.hpah.core.Enemy.Boss;
 import com.isep.hpah.core.Enemy.Enemy;
 import com.isep.hpah.core.Logic.LogicTxt;
 import com.isep.hpah.core.SortingHat.SortingHat;
 import lombok.Getter;
 import lombok.Setter;
 import com.isep.hpah.core.Spell.Spell;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

 import static java.lang.System.in;
 import static java.lang.System.out;

@Getter
@Setter
public class Wizard extends Character {

    LogicTxt lt = new LogicTxt();

    private House house;

        private Pet pet;

        private Wand wand;

        private String name;

        private List<Potion> potions;

        private List<Spell> knownSpells;



    public Wizard(String name, House house,Pet pet, Wand wand, List<Spell> spells, List<Potion> potions) {
        super(100, 1);
        this.name = name;
        this.wand = wand;
        this.house = house;
        this.pet = pet;
        this.knownSpells = spells;
        this.potions = potions;
    }
}