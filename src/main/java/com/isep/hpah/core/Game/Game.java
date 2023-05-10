package com.isep.hpah.core.Game;

import com.isep.hpah.core.Enemy.Boss;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.House;
import com.isep.hpah.core.Wizard.Pet;
import com.isep.hpah.core.Wizard.Wand;
import com.isep.hpah.core.Wizard.Wizard;
import com.isep.hpah.core.Year.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.isep.hpah.core.Logic.LogicTxt;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Game {
    LogicTxt lt = new LogicTxt();

    Fight fight = new Fight();

    Year1 year1 = new Year1();

    Year2 year2 = new Year2();

    Year3 year3 = new Year3();

   Year4 year4 = new Year4();

   Year5 year5 = new Year5();

   Year6 year6 = new Year6();

   Year7 year7 = new Year7();

    Spell spell;

    public void Game() {
        lt.header("Harry Potter at Home");
        lt.anythingToContinue();
        System.out.println("Welcome to Hogwarts! Before we can start your journey, we need to set some things up.");
        String name = lt.askStr("First, what is your name?", true);
        System.out.println("");
        System.out.println("");
        Wand wand = Wand.createWand();
        lt.anythingToContinue();
        Pet pet = Pet.createPet();
        lt.anythingToContinue();
        System.out.println("Now that you have everything you need, let's take the train to Hogwarts!");
        lt.anythingToContinue();
        System.out.println("You are now heading to the Great Hall to be sorted into your house by the sorting hat.");
        House house = House.houseSelection();
        lt.anythingToContinue();
        Wizard wz = new Wizard(name, house, pet, wand, null, null);
        System.out.println("Here are your stats : " +
                "\nName : " + wz.getName() +
                "\nHouse : " + wz.getHouse().getName() +
                "\nWand : " + wz.getWand().getName() +
                "\nPet : " + wz.getPet().getName() +
                "\nHealth : " + wz.getMaxHealth());
        System.out.println("You are now ready to start your journey at Hogwarts!");
        lt.anythingToContinue();
        lt.clearConsole();
        year1.introYear1();
        Spell Wingardium_Leviosa = new Spell("Wingardium Leviosa", 30);
        List<Spell> spells = new ArrayList<>();
        spells.add(Wingardium_Leviosa);
        wz.setKnownSpells(spells);
        fight.attackBossWz(new Boss("Troll", 150, 10), wz, spells);
        fight.rewards(wz);
        lt.clearConsole();
        year2.introYear2();
        if (wz.getHouse().getName().equals("Gryffindor")) {
            wz.getKnownSpells().removeAll(wz.getKnownSpells());
            System.out.println("Your house hase given you the Gryffindor's sword");
            lt.anythingToContinue();
            Spell GryffindorSword = new Spell("Gryffindor's Sword", 150);
            wz.getKnownSpells().add(GryffindorSword);
            wz.setKnownSpells(spells);
        } else {
            wz.getKnownSpells().removeAll(wz.getKnownSpells());
            Spell BasiliskFang = new Spell("Basilisk Fang", 125);
            wz.getKnownSpells().add(BasiliskFang);
            wz.setKnownSpells(spells);
        }
        fight.attackBossWz(new Boss("Basilisk", 750, 15), wz, spells);
        wz.getKnownSpells().removeAll(wz.getKnownSpells());
        Spell WingardiumLeviosa = new Spell("Wingardium Leviosa", 30);
        Spell Accio = new Spell("Accio", 40);
        wz.getKnownSpells().add(WingardiumLeviosa);
        wz.getKnownSpells().add(Accio);
        wz.setKnownSpells(spells);
        fight.rewards(wz);
        lt.clearConsole();
        year3.introYear3();
        Spell Expecto_Patronum = new Spell("Expecto Patronum", 250);
        wz.getKnownSpells().add(Expecto_Patronum);
        wz.setKnownSpells(spells);
        fight.attackBossWz(new Boss("Dementor", 1000, 20), wz, spells);
        fight.rewards(wz);
        wz.getKnownSpells().remove(Expecto_Patronum);
        Spell ExpectoPatronum = new Spell("Expecto Patronum", 50);
        wz.getKnownSpells().add(ExpectoPatronum);
        wz.setKnownSpells(spells);
        lt.clearConsole();
        year4.introYear4();
        fight.attackBossWz(new Boss("Portolion", 500, 10), wz, spells);
        fight.rewards(wz);
        lt.clearConsole();
        year5.introYear5();
        fight.attackBossWz(new Boss("Dolores Ombrage", 1000, 10), wz, spells);
        fight.rewards(wz);
        lt.clearConsole();
        year6.introYear6();
        Spell Sectumsempra = new Spell("Sectumsempra", 200);
        wz.getKnownSpells().add(Sectumsempra);
        wz.setKnownSpells(spells);
        if (wz.getHouse().getName().equals("Slytherin")) {
            lt.header("You need to take a Decison");
            int ask = lt.askInt("Do you want to join the Death Eaters?" +
                    "\n" + "1. Yes" +
                            "\n" + "2. No", 2);
            if (ask == 1) {
                lt.header("You have joined the Death Eaters");
                lt.header("You are now unstoppable");
                lt.header("You rule the world");
                lt.anythingToContinue();
                System.exit(0);
            } else {
                lt.header("You have chosen the right path");
                lt.header("You are now ready to fight Voldemort");
                lt.anythingToContinue();
            }
        }
        fight.attackBossWz(new Boss("Death Eaters", 2000, 15),wz,spells);
        fight.rewards(wz);
        wz.getKnownSpells().remove(Sectumsempra);
        Spell SectumSempra = new Spell("SectumSempra", 75);
        wz.getKnownSpells().add(SectumSempra);
        wz.setKnownSpells(spells);
        lt.clearConsole();
        year7.introYear7();
        Spell Expelliarmus = new Spell("Expelliarmus", 100);
        wz.getKnownSpells().add(Expelliarmus);
        wz.setKnownSpells(spells);
        fight.attackBossWz(new Boss("Voldemort", 700, 25),wz,spells);
        lt.header("You have saved the world from Voldemort!");
        System.exit(0);
    }
}
