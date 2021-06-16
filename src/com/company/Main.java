package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(650);
        boss.setDamage(50);
        boss.setProtection("Magical");
        System.out.println(boss.getHealth() + " " + boss.getProtection() + " " + boss.getDamage());
        for (Hero x:createHeroes()) {
            System.out.print(x.getHealth() + " ");
            System.out.print(x.getDamage() + " ");
            System.out.println(x.getSuperpowers());

        }
    }
    public static Hero[] createHeroes() {
        Hero Mag = new Hero(240, 20, "Fire");
        Hero Knight = new Hero(270, 20, "Earth");
        Hero Medic = new Hero(200, 15, "Healing");
        return new Hero[]{Mag, Knight, Medic};
    }
}
