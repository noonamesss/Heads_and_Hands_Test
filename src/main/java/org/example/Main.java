package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player = new Player(20, 30, 3, 1, 5);
        Monster monster = new Monster(20, 30, 4, 1, 3);
        while (monster.getAliveStatus() & player.getAliveStatus()){
            if ( player.getAliveStatus()){
                player.isAttacked(monster);
            }
            System.out.println("Монстр HP: "+monster.getHealth());
            System.out.println("Монстр жив? "+monster.getAliveStatus());

            if (monster.getAliveStatus()){
                monster.isAttacked(player);
            }
            System.out.println("Игрок HP: "+player.getHealth());
            player.Healing();
            System.out.println("Игрок HP: "+player.getHealth());
            System.out.println("Игрок жив? "+player.getAliveStatus());
        }

    }
}
