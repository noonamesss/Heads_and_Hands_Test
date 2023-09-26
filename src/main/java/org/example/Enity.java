package org.example;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Enity {
    private int Health;
    private int Attack;
    private int Block;
    private Random r;
    private ArrayList<Integer> damage = new ArrayList<Integer>();
    public boolean isAlive;
    public void isAttack(@org.jetbrains.annotations.NotNull Enity e){
        int AttackModificator = this.Attack - e.Block+1;
        if (AttackModificator < 1) AttackModificator = 1;
        ArrayList<Integer> cubeRolls = new ArrayList<Integer>();

        for (int i = 0; i<AttackModificator; i++) {
            cubeRolls.add(ThreadLocalRandom.current().nextInt(1, 6 + 1));
        }
        if (cubeRolls.stream().anyMatch(s->s==5 | s==6)) {
            e.setHealth(e.getHealth() - this.damage.get(ThreadLocalRandom.current().nextInt(this.damage.size())));
            boolean dead = e.getHealth() <= 0;
            if (dead) e.isAlive = false;
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

    public void setSeed(long seed)
    {
        this.r = new Random(seed);
    }
    public void setDamage(){
        Collections.shuffle(this.damage);
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
