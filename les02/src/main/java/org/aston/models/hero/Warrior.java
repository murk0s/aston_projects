package org.aston.models.hero;

import org.aston.models.enemy.Enemy;
import org.aston.service.Service;

public class Warrior extends Hero {
    private static final int POWER_WARRIOR = 10;
    public Warrior(String name) {
        super(name, POWER_WARRIOR, 100);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            System.out.printf("Воин %s атакует врага %s\n", getName(), enemy.getName());
            enemy.takeDamage(Service.getImpactForce(this.getPower()), this);
        }
    }

}
