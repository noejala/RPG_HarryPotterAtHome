package com.isep.hpah.core.Enemy;

import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Wizard.Character;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Boss extends Character {

    String name;

    public Boss(String name, int maxHealth, int damage) {
        super(maxHealth, damage);
        this.name = name;
    }



}
