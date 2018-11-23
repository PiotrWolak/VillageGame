package edu.piotr;

public class Village {

    private String name;
    private int gold;
    private Farm farm;
    private Tower tower;

    public Village(String name) {
        this.name = name;
        gold = 100;
        farm = new Farm();
        tower = new Tower();
        MoneyMaker goldIncome = new MoneyMaker(this);
        Thread t1 = new Thread(goldIncome);
        t1.start();
    }

    public boolean upgrade(Building facility) {

        int cost = 10 * facility.getLevel();
        System.out.println("The  cost of upgrading " + facility.getName() + " is " + cost + "gold");
        System.out.println("Do you want to proceed ? 1- yes, 2-no");
        int choice = Main.getChoiceMenu();
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
}
