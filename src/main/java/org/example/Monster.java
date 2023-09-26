package org.example;


public class Monster extends Enity{

    public Monster(int health, int attack, int block, int damageMin, int damageMax) {
        super(health, attack, block, damageMin, damageMax);
        this.setDamage();
    }

}
