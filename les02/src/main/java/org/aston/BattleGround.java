package org.aston;

import org.aston.models.enemy.Enemy;
import org.aston.models.hero.Archer;
import org.aston.models.hero.Hero;
import org.aston.models.hero.Mage;
import org.aston.models.hero.Warrior;

import java.util.List;
import java.util.Scanner;

import static org.aston.service.Service.*;

public class BattleGround {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Добро пожаловать в игру! Введите имя персонажа:");
        String name = scanner.nextLine();
        System.out.println("Добро пожаловать в игру! Выберите типа героя:\n1. Воин\n2. Лучник\n3. Маг");
        switch (scanner.nextInt()){
            case 1:
                Warrior warrior = new Warrior(name);
                startGame(warrior);
                break;
            case 2:
                Archer archer = new Archer(name);
                startGame(archer);
                break;
            case 3:
                Mage mage = new Mage(name);
                startGame(mage);
                break;
            default:
                System.out.println("Неверный тип героя");

        }
    }

    public static void startGame(Hero hero) throws InterruptedException {
        /*
        Герой будет сражаться с 3 случайными врагами
        Сила каждого удара у персонажей генерируется рандомно, но не больше power у объекта
        Зомби могут воскреснуть, но только 3 раза
        Скелеты могут нанести дополнительный супер-удар максимальной силы
         */
        List <Enemy> enemies = generateEnemies(3);
        System.out.printf("Против %s сражаются:\n", hero.getName());
        enemies.stream().forEach(System.out::println);
        System.out.println("Бой начался...");

        while (hero.isAlive() && isAliveAnyEnemy(enemies)) {
            Thread.sleep(2000);
            enemies.stream().forEach(enemy -> {if (enemy.isAlive()) hero.attackEnemy(enemy);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        System.out.printf((hero.isAlive()? "Бой закончился... %s победил!!!":"Бой закончился... %s проиграл..."), hero.getName());
    }
}
