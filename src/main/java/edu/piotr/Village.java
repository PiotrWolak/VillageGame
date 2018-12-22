package edu.piotr;

import edu.piotr.Buildings.Building;
import edu.piotr.Buildings.Farm;
import edu.piotr.Buildings.Tower;
import edu.piotr.Buildings.Treasury;

public class Village {

    private String name;
    private int gold;
    private Farm farm;
    private Tower tower;

    private Treasury treasury;

    public Village(String name) {
        this.name = name;
        gold = 100;
        farm = new Farm();
        tower = new Tower();
        treasury =  new Treasury();
        //an additional thread is called to add gold every 10 secounds
        MoneyMaker goldIncome = new MoneyMaker(this);
        Thread t1 = new Thread(goldIncome);
        t1.start();
    }

    public void printFacilities(){
        System.out.println("your Farm level is " + this.farm.getLevel());
        System.out.println("your Tower level is " + this.tower.getLevel());
        System.out.println("your Treasury level is " + this.treasury.getLevel());

    }

    public boolean upgrade(Building facility) {

        int cost = 10 * facility.getLevel();
        System.out.println("The  cost of upgrading " + facility.getName() + " is " + cost + "gold");
        System.out.println("Do you want to proceed ? 1- yes, 2-no");
        int choice = Menu.getChoiceMenu();
        switch (choice) {
            case 1:
                if (this.getGold() >= cost) {
                    this.setGold(this.getGold() - cost);
                    facility.upgrade();
                    return true;
                } else {
                    System.out.println("Not enough gold");
                    return false;
                }
            case 2:
                return false;
            default:
                return false;
        }

    }
    public void pay(){
        this.gold += farm.getIncome();
    }
    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public String getName() {
        return name;
    }

    public Farm getFarm() {
        return farm;
    }

    public Tower getTower() {
        return tower;
    }

    public Treasury getTreasury() {
        return treasury;
    }
}
