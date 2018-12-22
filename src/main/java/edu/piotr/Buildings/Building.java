package edu.piotr.Buildings;

public abstract class Building implements Facility {
    private int level;
    private String name;

    public Building() {
        this.level = 1;
    }

    public void upgrade() {
        this.setLevel(this.getLevel() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void toSring() {
        System.out.println(this.name + " level " + getLevel());
    }

}
