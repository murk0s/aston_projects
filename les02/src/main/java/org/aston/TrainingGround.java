package org.aston;

import org.aston.models.enemy.Enemy;
import org.aston.models.hero.Archer;
import org.aston.models.hero.Hero;
import org.aston.models.hero.Mage;
import org.aston.models.hero.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Саурон", 10, 100);
        //Hero hero = new Hero("Фродо Бэггинс", 5);
        //hero.attackEnemy(enemy);
        Hero warrior = new Warrior("Арагорн");
        warrior.attackEnemy(enemy);
        Hero mage = new Mage("Гэндельф");
        mage.attackEnemy(enemy);
        Hero archer = new Archer("Леголас");
        archer.attackEnemy(enemy);
        System.out.println("Здоровье "+enemy.getName()+" "+enemy.getHealth());

//        archer.attackEnemy(mage);
//        System.out.println("Здоровье "+mage.getName()+" "+mage.getHealth());
    }

}
