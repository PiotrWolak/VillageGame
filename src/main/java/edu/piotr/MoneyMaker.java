package edu.piotr;

import edu.piotr.Buildings.Treasury;

public class MoneyMaker implements Runnable {
    private Village village;
    private Treasury treasury;

    public MoneyMaker(Village village) {
        this.village = village;
        this.treasury = village.getTreasury();
    }

    public boolean pay(int gold) {
        if (village.getTreasury().getCapacity() >= village.getGold() + gold) {
            village.setGold(village.getGold() + gold);
            return true;
        } else {
            System.out.println("Your income is too big for your treasury, upgrade it !");
            return false;
        }

    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //todo
                System.out.println("An error occured");
                e.printStackTrace();
            }
            village.pay();
        }
    }
}
