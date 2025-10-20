package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private int price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, int price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        if(!isOccupied&&!isDirty) {
            this.isAvailable = true;
        }
        else {
            this.isAvailable = false;
        }
    }

    public Room() {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
