package edu.piotr;

public class Farm extends Building {
    private int income;

    public int getIncome() {
        return income;
    }

    public Farm() {
        setName("Farm");
        income = 1;
    }


    public void upgrade() {
        //todo check whether this actually works
        super.upgrade();
        income = income * 2;
    }
}
