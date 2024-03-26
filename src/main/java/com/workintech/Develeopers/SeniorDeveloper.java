package com.workintech.Develeopers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(Salaries.SENIOR.getSalary());
        System.out.println("senior developer starts to working...");
    }

}
