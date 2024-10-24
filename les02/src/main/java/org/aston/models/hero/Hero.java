package org.aston.models.hero;

import org.aston.models.Mortal;
import org.aston.models.enemy.Enemy;

public abstract class Hero implements Mortal {
    private final String name;
    private int power;
    private int health;

    public Hero(String name, int power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy) ;

    public int getPower() {
        return power;
    }

    private Hero setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public String getType(){
        String type = "";
        if (this instanceof Warrior) type = "Воин";
        else if (this instanceof Archer) type = "Лучник";
        else if (this instanceof Mage) type = "Маг";
        return type;
    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.printf("%s %s получил урон %d хп, осталось здоровья - %d\n", getType(), getName(), damage, health);
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }
}
