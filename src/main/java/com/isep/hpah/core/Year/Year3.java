package com.isep.hpah.core.Year;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Year3 {

    LogicTxt lt = new LogicTxt();

    Wizard wz;

    public void introYear3() {
        lt.header("Welcome to your third year at Hogwarts!");
        System.out.println("I am Remus Lupin, for this third year, we will focus on the Defence Against the Dark Arts.");
        System.out.println("");
        System.out.println("You have learned the following spell: Expecto Patronum !");
        lt.anythingToContinue();

    }
}
