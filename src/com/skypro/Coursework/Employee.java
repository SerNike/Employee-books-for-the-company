package com.skypro.Coursework;

public class Employee {
    private final int id;
    private String fullName;
    private int salary;
    private int department;
    private static int idCounter = 1;

    public Employee (String fullName, int salary, int department) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "ФИО сотрудника: " + fullName + " Зарплата сотрудника: " + salary + " Деп сотрудника " + department;
    }


}
