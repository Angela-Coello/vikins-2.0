package org.example.soldier;

public class Soldier {
    public int health ;

    public  int strength;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }
    public int attack() {
        return this.strength;
    }
    public String receiveDamage(int damage) {
        this.health -= damage;
        return String.valueOf(this.health);
    }
}