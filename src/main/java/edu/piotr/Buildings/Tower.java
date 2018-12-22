package edu.piotr.Buildings;

public class Tower extends Building {
    private int defense;

    public Tower(){
        setName("Tower");
        defense = 10;
    }

    @Override
    public void upgrade() {
        super.upgrade();
        defense += 10;
    }

    public int getDefense() {
        return defense;
    }
}
