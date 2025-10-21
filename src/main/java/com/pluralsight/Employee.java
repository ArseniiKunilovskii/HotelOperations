package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double currentShift = 0;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void punchTimeCard(double time){
        if(currentShift == 0){
            currentShift = time;
        } else {
            currentShift = time - currentShift;
            hoursWorked += currentShift;
            currentShift = 0;
        }
    }

    public void punchTimeCard(){
        if(currentShift==0){
            LocalDateTime start = LocalDateTime.now();
            int hours = start.getHour();
            int minutes=start.getMinute();
            currentShift = hours+((double) minutes /60);

        }else {
            LocalDateTime start = LocalDateTime.now();
            int hours = start.getHour();
            int minutes=start.getMinute();
            currentShift = hours+((double) minutes /60) - currentShift;
            hoursWorked+=currentShift;
            currentShift=0;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }


}