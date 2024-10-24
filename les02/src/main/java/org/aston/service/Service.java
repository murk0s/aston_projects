package org.aston.service;

import org.aston.models.enemy.Enemy;
import org.aston.models.enemy.Skeleton;
import org.aston.models.enemy.Zombie;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static int getImpactForce(int force) {
        return 1 + (int) Math.round(Math.random()*(force-1));
    }

    public static List<Enemy> generateEnemies(int cnt) {
        List <Enemy> enemies = new ArrayList<Enemy>();
        for (int i = 0; i<cnt; i++) enemies.add((Math.round(Math.random())==0) ? new Skeleton() : new Zombie());
        return enemies;
    }

    public static boolean isAliveAnyEnemy(List <Enemy> enemies) {
        boolean isAlive = false;
        for (Enemy enemy: enemies) isAlive = isAlive || enemy.isAlive();
        return isAlive;
    }
}
