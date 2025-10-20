package com.pluralsight;

public class Reservation {
    private String type;
    private double price;
    private boolean isWeekend;
    private int numberOfNight;
    private double reservationTotal;
    public Reservation(String type, boolean isWeekend, int numberOfNight) {
        this.type = type;
        this.isWeekend = isWeekend;
        this.numberOfNight = numberOfNight;
        if(type.equalsIgnoreCase("king")){
            if (isWeekend){
                this.price=139.0*1.1;
            }
            else {
                this.price = 139.0;
            }
        }else {
            if (isWeekend){
                this.price=124.0*1.1;
            }
            else {
                this.price = 124.0;
            }
        }
        this.reservationTotal = price*numberOfNight;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }
}
