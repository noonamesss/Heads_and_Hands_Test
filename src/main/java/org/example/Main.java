package org.example;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(30, 30, 1, 1, 10, 1234123313);
        Monster monster = new Monster(30, 30, 4, 1, 10, 111231321);
        //System.out.println("Монстр HP"+monster.getHealth());
        while (monster.getAliveStatus() & monster.getAliveStatus()){
            if ( player.getAliveStatus()){
                player.isAttack(monster);
            }
            System.out.println("Монстр HP: "+monster.getHealth());
            System.out.println("Монстр жив? "+monster.getAliveStatus());
            if (monster.getAliveStatus()){
                monster.isAttack(player);
            }
            System.out.println("Игрок HP: "+monster.getHealth());
            System.out.println("Игрок жив? "+monster.getAliveStatus());
        }

    }
}