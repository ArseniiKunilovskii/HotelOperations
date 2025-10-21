package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        bookedSuites = 0;
        bookedBasicRooms = 0;
    }

    public Hotel(String name, int bookedBasicRooms, int bookedSuites, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
            if(getAvailableSuites()>numberOfRooms){
                System.out.println("You booked "+ numberOfRooms+" suites.");
                bookedSuites+=numberOfRooms;
                return true;
            }
            else {
                System.out.println("Sorry! We have only "+ (getAvailableSuites())+" suites.");
                return false;
            }
        }else {
            if (getAvailableRooms()>numberOfRooms){
                System.out.println("You booked "+ numberOfRooms+" rooms.");
                bookedBasicRooms += numberOfRooms;
                return true;
            }else {
                System.out.println("Sorry! We have only "+ getAvailableRooms()+" suites.");
                return false;
            }
        }
    }
    public int getAvailableSuites(){
        return numberOfSuites-bookedSuites;
    }
    public int getAvailableRooms(){
        return numberOfRooms-bookedBasicRooms;
    }
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }
}
