package com.isep.hpah.core.Year;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;

public class Year5 {

    LogicTxt lt = new LogicTxt();

    Wizard wz;

    public void introYear5() {
        lt.header("Welcome to your fifth year at Hogwarts!");
        System.out.println("Voldemort is back, but nobody seems to care fore the moment.");
        System.out.println("A new teacher called Dolores Ombrage has been hired to teach the Defence Against the Dark Arts.");
        System.out.println("");
        lt.anythingToContinue();
    }
}
