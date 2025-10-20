package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public Employee(){

    }
    public double getTotalPay(){
        return this.payRate*getRegularHours()+getOvertimeHOurs()*payRate*2;
    }

    public double getRegularHours() {
        return Math.max(hoursWorked, 40);
    }

    public double getOvertimeHOurs(){
        return hoursWorked>40 ? hoursWorked-40: 0;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
