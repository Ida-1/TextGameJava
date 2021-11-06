package com.company;

import java.util.Random;
import java.util.Scanner;

public class main {
    public main(String[] args) {

        // System Objects
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        // Game variables
        String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // Player var
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChange = 50; // Percentage

        boolean running = true;

        System.out.println("Welcome to the Dungeon");

        GAME:

        while(running) {
            System.out.println("-------------------------------------------------");

            int enemyHealth = r.nextInt(maxEnemyHealth);
            String enemy = enemies[r.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + "appeared! #\n");

            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = r.nextInt(attackDamage);
                    int damageTaken = r.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + "damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation");

                    if (health < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!.");
                        break;
                    }
                } else if (input.equals("2")) {
                    if(numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
                                + "\n\t> You have now " + health + " HP."
                                + "\n\t> You have " + numHealthPotions + " health potions left.\n");
                    }
                    else {
                        System.out.println("\t> You have no health potions left! Defeat enemies for chance to get one!\n");
                    }

                } else if (input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME;


                } else {
                    System.out.println("\tJerk, invalid command!");

                }
            }

            if(health >1) {
                System.out.println("You limp out from the dungeon, weak from battle");
                break;
            }

            System.out.println("-------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! #");
            System.out.println(" # You have " + health + "HP left. #");
            if(r.nextInt(100) < healthPotionDropChange) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! #" );
                System.out.println(" # You have " + numHealthPotions + "health potions(s). # ");
            }

        }

    }
}
