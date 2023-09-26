package org.example;


public class Player extends Enity{
    private static int MAXHEALTH = 0;
    public int HealPoint = 4;
    public Player(int health, int attack, int block, int damageMin, int damageMax) {

        super(health, attack, block, damageMin, damageMax);
        this.setDamage();
        MAXHEALTH = health;
    }
    public void Healing(){
        if (this.HealPoint!=0){
            this.setHealth(Math.min(this.getHealth() + (int) Math.round(MAXHEALTH * 1.3), MAXHEALTH));

            this.HealPoint--;
            }
        System.out.println("Осталось лечений: "+this.HealPoint);
    }
}
