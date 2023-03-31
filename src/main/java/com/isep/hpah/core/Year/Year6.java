package com.isep.hpah.core.Year;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Year6 {

    LogicTxt lt = new LogicTxt();

    Wizard wz;

    public void introYear6() {
        lt.header("Welcome to your sixth year at Hogwarts!");
        System.out.println("Everyone is now aware of Voldemort's return.");
        System.out.println("You have to be prepared for the worst.");
        System.out.println("");
        System.out.println("You have learned the following spell: Sectumsempra !");
        lt.anythingToContinue();
    }
}
