package com.isep.hpah.core.Year;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Year2 {

    LogicTxt lt = new LogicTxt();

    Wizard wz;

    public void introYear2() {
        lt.header("Welcome to your second year at Hogwarts!");
        System.out.println("I am Gilderoy Lockhart, for this second year, we will focus on duelling.");
        System.out.println("You have learned the following spell: Accio !");
        lt.anythingToContinue();
    }
}
