package com.isep.hpah.core.Year;

import com.isep.hpah.core.Enemy.Boss;
import com.isep.hpah.core.Enemy.Enemy;
import com.isep.hpah.core.Game.Fight;
import com.isep.hpah.core.Game.Game;
import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Year1{

    LogicTxt lt = new LogicTxt();

    private List<Enemy> enemies = new ArrayList<>();

    Game game;

public void introYear1() {
        lt.header("Welcome to your first year at Hogwarts!");
        System.out.println("You are a young wizard, and you have just been accepted to Hogwarts School of Witchcraft and Wizardry.");
        System.out.println( "My name is Professor Filius Flitwick, and I will be your charms teacher this year.");
        System.out.println("Today, you will have your first class charms class.");
        System.out.println("");
        System.out.println("You have learned two new spells: Rookie Spell and Wingardium Leviosa !");
        lt.anythingToContinue();
    }



}
