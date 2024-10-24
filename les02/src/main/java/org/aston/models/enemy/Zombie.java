package org.aston.models.enemy;

import org.aston.models.hero.Hero;

public class Zombie extends Enemy {
    private static final int POWER_ZOMBIE = 1;
    private static final int HEALTH_ZOMBIE = 10;
    private int lifes;
    private static int id;
    public Zombie() {
        super("Zombie"+(++id), POWER_ZOMBIE, HEALTH_ZOMBIE);
        lifes = 3;
    }
    @Override
    public void takeDamage(int damage, Hero hero){
        super.takeDamage(damage, hero);
        //зомби может воскреснуть, но только три раза
        if (!isAlive() && lifes>0){
            setHealth(HEALTH_ZOMBIE);
            System.out.printf("Враг %s воскрес... У него осталось жизней - %d\n", getName(), --lifes);
        }
    }
}
