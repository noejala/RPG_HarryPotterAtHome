package com.isep.hpah.core.Spell;
import lombok.*;
@Getter
@Setter
public class Spell {
    private String name;
    private int damage;

    public Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}