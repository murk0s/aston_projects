package org.aston.models.enemy;

import org.aston.models.hero.Hero;

public class Skeleton extends Enemy{
    private static final int POWER_SKELETON = 10;
    private static final int HEALTH_SKELETON = 10;
    private static int id;
    public Skeleton() {
        super("Skeleton"+(++id), POWER_SKELETON, HEALTH_SKELETON);
    }

    //@Override
    public void attackHero(Hero hero) {
        //Скелет может нанести дополнительный супер-удар
        super.attackHero(hero);
        boolean isSuper = (Math.round(Math.random())==0) ? false : true;
        if (isAlive() && isSuper) {
            System.out.printf("Враг %s наносит дополнительный супер-удар!\n", this.getName(), hero.getName());
            hero.takeDamage(POWER_SKELETON);
        }
    }
}
