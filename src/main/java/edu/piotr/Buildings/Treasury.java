package edu.piotr.Buildings;

public class Treasury extends Building implements Facility {
    private int capacity;


    public Treasury(){
        int capacity= 500;
    }

    public void upgrade(){
        super.upgrade();
        this.setCapacity(getLevel()*500);
    }

    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
