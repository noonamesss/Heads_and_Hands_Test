package org.example;

public class Monster extends Enity{

    public Monster(int health, int attack, int block, int damageMin, int damageMax, long seed) {
        super(health, attack, block, damageMin, damageMax);
        this.setSeed(seed);
        this.setDamage();
    }
}
