package com.isep.hpah.core.Enemy;
import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Wizard.Character;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Enemy extends Character {


    private String name;

    private List<Enemy> enemiesList;

    public Enemy(String name, int maxHealth, int damage) {
        super(maxHealth, damage);
        this.name = name;

    }
}


