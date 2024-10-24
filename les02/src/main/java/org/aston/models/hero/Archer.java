package org.aston.models.hero;


import org.aston.models.enemy.Enemy;
import org.aston.service.Service;

public class Archer extends Hero {
    private static final int POWER_ARCHER = 7;
    public Archer(String name) {
        super(name, POWER_ARCHER, 100);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            System.out.printf("Лучник %s атакует врага %s\n", getName(), enemy.getName());
            enemy.takeDamage(Service.getImpactForce(this.getPower()), this);
        }
    }
}
