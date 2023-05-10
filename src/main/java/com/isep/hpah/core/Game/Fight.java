package com.isep.hpah.core.Game;

import com.isep.hpah.core.Enemy.Boss;
import com.isep.hpah.core.Enemy.Enemy;
import com.isep.hpah.core.Logic.LogicTxt;
import com.isep.hpah.core.Spell.Spell;
import com.isep.hpah.core.Wizard.Wizard;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static java.lang.System.getenv;
import static java.lang.System.out;

@Getter
@Setter
public class Fight {

    LogicTxt lt = new LogicTxt();

    Wizard wz;
    private int round = 1;

    public void attackEnemyWz(Enemy enemy, List<Enemy> enemies, Wizard wz, List<Spell> spells) {
        while (true) {
            for (int i = 0; i < enemies.size(); i++) {
                out.println("Which enemy do you want to attack ? ");
                List<Enemy> enemiesList = enemies;
                for (int k = 0; k < enemiesList.size(); k++) {
                    out.println("\n" + (k + 1) + enemies.get(k).getName() + " with " + enemies.get(k).getDamage() + " and " + enemies.get(k).getCurrentHealth() + " health left !");
                }
                spells = wz.getKnownSpells();
                int target = lt.askInt("Which enemy do you want to attack ?\n", enemies.size());
                out.println("Choose your spell :");
                for (int j = 0; j < spells.size(); j++) {
                    out.print("\n" + (j + 1) + ". " + spells.get(j).getName() + " with " + spells.get(j).getDamage() + " damage");
                }
                int spellChoice = lt.askInt("\nWhat spell do you want to use ?\n", spells.size());
                Spell spell = spells.get(spellChoice - 1);
                enemies.get(target - 1).takeDamage((int) (enemy.getDamage() * spell.getDamage()));
                if (enemies.get(target - 1).getCurrentHealth() <= 0) {
                    enemies.remove(target - 1);
                    out.println("You have killed " + enemies.get(target - 1).getName() + " !");
                } else {
                    out.println("You have done " + wz.getDamage() + " damage!");
                    out.println(enemies.get(target - 1).getName() + " has " + enemies.get(target - 1).getCurrentHealth() + " health left !");
                }
                if (enemies.size() == 0) {
                    lt.header("Congratulations, you have killed all the enemies !");
                    round++;
                } else {
                    lt.header("Enemies Round !");
                    lt.anythingToContinue();
                    for (Enemy e : enemies) {
                        System.out.println("It's the turn of " + e.getName() + " !");
                        wz.takeDamage((int) e.getDamage());
                        if (wz.getCurrentHealth() <= 0) {
                            LogicTxt lt = new LogicTxt();
                            System.out.println("You have died!");
                            lt.header("GAME OVER");
                            lt.anythingToContinue();
                            System.exit(0);
                        } else {
                            System.out.println(e.getName() + " has done " + e.getDamage() + " damage !");
                            System.out.println("You have " + wz.getCurrentHealth() + " health left !");
                        }

                    }
                    lt.header("Your Turn ! ");
                    lt.anythingToContinue();
                }
            }

        }


    }

    public void attackBossWz(Boss boss,Wizard wz,List<Spell> Spells) {
        lt.header("Let the Fight "+ round+" begin !");
        if (round == 3 ){
            lt.header("You have to use Expecto Patronnum to get rid of the Dementor !");
            lt.anythingToContinue();
        }
        if (round == 4 ){
            lt.header("You have to hit the Portolion to escape");
            lt.anythingToContinue();
        }
        if (round == 6 ){
            lt.header("You have to use Sectumsempra to get rid of the Death Eater !");
            lt.anythingToContinue();
        }
        while (true) {
            out.println("[ " + boss.getName() + " with " + boss.getDamage() + " damages and " + boss.getCurrentHealth() + " health points left !]");
            Spells = wz.getKnownSpells();
            out.println("");
            out.println("Choose your spell :");
            for (int j = 0; j < Spells.size(); j++) {
                out.print("\n" + (j + 1) + ". " + Spells.get(j).getName() + ", it has " + (int)(wz.getDamage() * Spells.get(j).getDamage()) + " damage");
            }
            int spellChoice = lt.askInt("\nWhat spell do you want to use ?\n", Spells.size());
            Spell spell = Spells.get(spellChoice - 1);
            out.println("You have chosen " + spell.getName() + " !");
            boss.takeDamage((int) (wz.getDamage() * spell.getDamage()));
            if ( round ==5 && boss.getCurrentHealth() <= boss.getMaxHealth()/2){
                out.println("Fireworks have just spawned !");
                out.println("Dolores Ombrage cannot handle this humliliation and has fled !");
                boss.setCurrentHealth(0);
                lt.header("Congratulations, you have won against " + boss.getName() + " !");
                lt.anythingToContinue();
                round++;
                break;
            }
            if (boss.getCurrentHealth() <= 0) {
                boss.setCurrentHealth(0);
                if (round == 4 ){
                    lt.header("The Portolion is charged !");
                    lt.anythingToContinue();
                    lt.header("You have escaped !");
                    round++;
                    break;
                } else {
                    lt.header("Congratulations, you have killed " + boss.getName() + " !");
                }
                lt.anythingToContinue();
                round++;
                break;
            } else {
                out.println("You have done " + (int)(wz.getDamage() * spell.getDamage()) + " damage !");
                out.println("The " + boss.getName() + " has " + boss.getCurrentHealth() + " health left !");
                lt.header("Boss Round !");
                lt.anythingToContinue();
                if (round == 4 ){
                    out.println("It's the turn of Peter Pettigrow !");

                } else {
                    out.println("It's the turn of " + boss.getName() + " !");
                }
                wz.takeDamage((int) boss.getDamage());
                if (wz.getCurrentHealth() <= 0) {
                    LogicTxt lt = new LogicTxt();
                    out.println("You have died!");
                    lt.header("GAME OVER");
                    lt.anythingToContinue();
                    System.exit(0);
                } else {
                    if (round == 4 ){
                        out.println("Peter Pettigrow has done " + boss.getDamage() + " damage !");

                    } else {
                        out.println(boss.getName() + " has done " + boss.getDamage() + " damage !");
                    }
                    out.println("You have " + wz.getCurrentHealth() + " health left !");
                    lt.header("Your Turn !");
                    lt.anythingToContinue();
                }
            }
        }
    }

    public void rewards(Wizard wz) {
        wz.setCurrentHealth(wz.getMaxHealth());
        lt.header("First, you recovered all your health !");
        lt.header("You can now choose your reward");
        int rewards = lt.askInt("Choose your reward " + wz.getName() + " :" +
                "\n1 : Upgrade your attack " +
                "\n2 : Increase your health " +
                "\n3 : A minor increase of both", 3);
        switch (rewards) {
            case 1:
                wz.setDamage(wz.getDamage() + 0.25);
                lt.header("Your attack has been upgraded !");
                break;
            case 2:
                wz.setMaxHealth(wz.getMaxHealth() + 50);
                lt.header("Your health has been increased !");
                break;
            case 3:
                wz.setDamage(wz.getDamage() + 0.1);
                wz.setMaxHealth(wz.getMaxHealth() + 20);
                lt.header("Your attack and health have been increased !");
                break;
        }

    }

}