package com.isep.hpah.core.Wizard;

import lombok.*;


import java.util.List;

@Getter
@Setter
public class Character {

    //attributes
    private int maxHealth;

    private int currentHealth;

    private double damage;

    //constructor
    public Character (int maxHealth, int damage){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.damage = damage;
    };

    public void removeHealth(int value) {this.currentHealth -= value;}

    public void takeDamage(int damage) {
        removeHealth(damage);
    }

    //methods

}
