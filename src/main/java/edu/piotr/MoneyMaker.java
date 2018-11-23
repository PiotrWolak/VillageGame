package edu.piotr;

public class MoneyMaker implements Runnable {
    private Village village;

    public MoneyMaker(Village village) {
        this.village = village;
    }

    public boolean pay(int gold) {
        village.setGold(village.getGold() + gold);
        //todo check whether amount of gold earned fits in treasury
        return true;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                //todo
                System.out.println("An error occured");
                e.printStackTrace();
            }
            pay(village.getFarm().getIncome());
            System.out.println("Gold income $$$ " + village.getGold());
        }
    }
}
