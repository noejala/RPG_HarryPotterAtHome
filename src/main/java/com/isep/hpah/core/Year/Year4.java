package com.isep.hpah.core.Year;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Year4 {

    LogicTxt lt = new LogicTxt();

    Wizard wz;

    public void introYear4() {
        lt.header("Welcome to your fourth year at Hogwarts!");
        System.out.println("This year, you will have to face the Triwizard Tournament.");
        System.out.println("You have been chosen to represent your school in the tournament.");
        lt.anythingToContinue();
    }


}
