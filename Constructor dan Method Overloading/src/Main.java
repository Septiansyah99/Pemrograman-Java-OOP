package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Dasep");
        Player player2 = new com.tutorial.Player();
        Player player3 = new Player();
        Player player4 = new Player("Septian");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading methods

        int a = Matematika.tambah(1, 19);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.98);
        System.out.println(b);
    }
}