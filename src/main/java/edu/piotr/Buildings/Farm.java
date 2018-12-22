package edu.piotr.Buildings;

public class Farm extends Building {
    private int income;

    public int getIncome() {
        return income;
    }

    public Farm() {
        setName("Farm");
        income = 1;
    }

    public void doubleIncome() {
        this.income *= 2;
    }

    public void upgrade() {
        //todo check whether this actually works
        super.upgrade();
        doubleIncome();
    }
}
