package com.workintech.Develeopers;

public enum Salaries {
    JUNIOR(40000),
    MID(60000),
    SENIOR(80000),
    HRMANAGER(120000);


    private double salary;


    Salaries(double  salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}
