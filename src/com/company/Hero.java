package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superpowers;

    public Hero(int health, int damage, String superpowers) {
        this.health = health;
        this.damage = damage;
        this.superpowers = superpowers;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpowers() {
        return superpowers;
    }
}
