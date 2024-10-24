package org.aston.models.hero;

import org.aston.models.enemy.Enemy;
import org.aston.service.Service;

public class Mage extends Hero {
    private static final int POWER_MAGE = 5;

    public Mage(String name) {
        super(name, POWER_MAGE, 100);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            System.out.printf("Маг %s атакует врага %s\n", getName(), enemy.getName());
            enemy.takeDamage(Service.getImpactForce(this.getPower()), this);
        }
    }
}
