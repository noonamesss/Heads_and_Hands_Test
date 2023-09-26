package org.example;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Enity {
    private int Health;
    private int Attack;
    private int Block;

    private ArrayList<Integer> damage = new ArrayList<Integer>();
    public boolean isAlive;
    public void isAttacked(Enity blocker){
        Random rattacker = new Random(System.currentTimeMillis()+100);
        Random rblocker = new Random(System.currentTimeMillis() - 1000000);
        int AttackModificator = this.getAttack() - blocker.getBlock()+1;
        if (AttackModificator < 1) AttackModificator = 1;
        ArrayList<Integer> cubeRolls = new ArrayList<Integer>();

        for (int i = 0; i<AttackModificator; i++) {
            cubeRolls.add(rattacker.nextInt(1, 6 + 1));
        }
        if (cubeRolls.stream().anyMatch(s->s==5 | s==6)) {
            blocker.setHealth(blocker.getHealth() - this.getDamage().get(rblocker.nextInt(this.getDamage().size())));
            boolean dead = blocker.getHealth() <= 0;
            if (dead) blocker.isAlive = false;
        }
    }
    public void setHealth(int newHealth){
        this.Health = newHealth;
    }
    public int getHealth(){
        return Health;
    }
    public int getAttack(){
        return Attack;
    }
    public int getBlock(){
        return Block;
    }
    public boolean getAliveStatus(){
        return isAlive;
    }
    public void setDamage(){
        Collections.shuffle(this.damage);
    }
    public ArrayList<Integer> getDamage(){
        return damage;
    }

    public Enity(int health, int attack, int block, int damageMin, int damageMax){
        this.isAlive = true;
        this.Health = health;
        this.Attack = attack;
        this.Block = block;
        for (int i = damageMin; i<=damageMax;i++){
            this.damage.add(i);
        }

    }
}
