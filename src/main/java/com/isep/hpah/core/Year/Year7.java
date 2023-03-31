package com.isep.hpah.core.Year;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Year7 {

    LogicTxt lt = new LogicTxt();

    Wizard wz;

    public void introYear7() {
        lt.header("Welcome to your last year at Hogwarts!");
        System.out.println("The Dark Lord is back, and he is stronger than ever.");
        System.out.println("You will not be at Hogwarts, it is too dangerous.");
        System.out.println("");
        System.out.println("You have learned the following spell: Expelliarmus !");
        lt.anythingToContinue();

    }
}
