package edu.piotr.Soliders;

public class Archer implements ISolider {
    int hp;
    int attack;

    public Archer() {
        hp = 100;
        attack = 10;
    }

    @Override
    public boolean attack() {
        return false;
    }

    @Override
    public boolean isAlive() {
        if (hp > 0) return true;
        else return false;
    }
}
