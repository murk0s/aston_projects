package org.aston.models.enemy;

import org.aston.models.Mortal;
import org.aston.models.hero.Hero;
import org.aston.service.Service;

public class Enemy implements Mortal {
    private final String name;
    private int power;
    private int health;
    public Enemy(String name, int power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public void attackHero(Hero hero) {
        if (isAlive()) {
            System.out.printf("Враг %s атакует героя %s\n", name, hero.getName());
            hero.takeDamage(Service.getImpactForce(this.getPower()));
        }
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    protected Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage, Hero hero){
        health -= damage;
        System.out.printf("Враг %s получил урон %d хп, осталось здоровья - %d\n", name, damage, health);
        if (!isAlive()) System.out.printf("Враг %s умер...\n", name);
        else attackHero(hero);
    }
    public boolean isAlive() {
        return (getHealth()>0);
    }

    @Override
    public String toString() {
        return getName()+" (сила удара - "+getPower()+", здороввья - "+getHealth()+")";
    }
}
