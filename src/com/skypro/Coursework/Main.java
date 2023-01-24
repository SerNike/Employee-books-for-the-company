package com.skypro.Coursework;

import java.util.concurrent.Callable;

public class Main {


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
                employeeBook.creatEmployee("Иван Иванович Иванов", 15000, 1);
                employeeBook.creatEmployee("Петр Петрович Петров", 20000, 2);
                employeeBook.creatEmployee("Андрей Якович Воронов", 11000, 3);
                employeeBook.creatEmployee("Альбина Сергеевна Кулич", 32000, 4);
                employeeBook.creatEmployee("Кузьма Андреевич Вольф", 13000, 5);
                employeeBook.creatEmployee("Сергей Сергеевич Сергеев", 35000, 1);
                employeeBook.creatEmployee("София Дмитриевна Кудрявцева", 82000, 2);
                employeeBook.creatEmployee("Роман Романович Романов", 73000, 3);
                employeeBook.creatEmployee("Савелий Андреевич Ушаков", 81000, 4);
                employeeBook.creatEmployee("Виталий Михайлович Шон", 38000, 5);

        System.out.println("Базовая сложность");
        EmployeeBook.PrintEmployees();
        System.out.println(" ");
        System.out.println("Минимальная ЗП у " + EmployeeBook.minSalary());
        System.out.println(" ");
        System.out.println("Максиммальная ЗП у " + EmployeeBook.maxSalary());
        System.out.println(" ");
        System.out.println("Общие затраты на ЗП составляют: " + EmployeeBook.FullSalary());
        System.out.println(" ");
        EmployeeBook.printFullName();
        System.out.println(" ");
        System.out.println("Повышенная сложность");
        System.out.println(" ");
        System.out.println(EmployeeBook.averageSalary());
        System.out.println(" ");
        EmployeeBook.indexSalary(10);
        EmployeeBook.PrintEmployees();
        System.out.println(" ");
        System.out.println(EmployeeBook.minSalaryDepartment(2));
        System.out.println(" ");
        System.out.println(EmployeeBook.maxSalaryDepartment(5));
        System.out.println(" ");
        System.out.println(EmployeeBook.fullSalaryDepartment(1));
        System.out.println(" ");
        System.out.println(EmployeeBook.avaSalaryDepartment(4));
        System.out.println(" ");
        System.out.println(" ");
        EmployeeBook.printDepartment(4);
        System.out.println(" ");
        EmployeeBook.printMinSalaryEmployee(20000);
        System.out.println(" ");
        EmployeeBook.printMaxSalaryEmployee(50000);
        System.out.println(" ");

        System.out.println("Очень сложно");
        System.out.println(" ");
        EmployeeBook.creatEmployee("Альберт Петрович Дронин", 13000, 5);
        System.out.println(" ");
        EmployeeBook.removeEmloyee("Кузьма Андреевич Вольф");
        EmployeeBook.creatEmployee("Альберт Петрович Дронин", 13500, 5);
        EmployeeBook.PrintEmployees();
        System.out.println(" ");
        EmployeeBook.changSalary("Альберт Петрович Дронин", 25000);
        EmployeeBook.changSalarys("Альберт Петрович Дронин", 2);
        EmployeeBook.PrintEmployees();
        System.out.println(" ");
        EmployeeBook.printDepartment();

    }
}