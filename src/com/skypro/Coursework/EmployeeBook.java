package com.skypro.Coursework;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


public class EmployeeBook {
    private static final Integer DEPARTMENT_COUNT = 5;
    private static final Integer EMPLOYEES_SIZE = 10;
    private static final Employee[] EMPLOYEES = new Employee[EMPLOYEES_SIZE];


    public static void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (employee == null) {
                System.out.println("Cвободное место");
            } else {
                System.out.println(employee);
            }
        }
    }

    public static int fullSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = EMPLOYEES[0];
        int minSalary = MAX_VALUE;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            for (Employee employee : EMPLOYEES) {
                if (employee != null) {
                    if (minSalary > employee.getSalary()) {
                        minSalary = employee.getSalary();
                        result = employee;
                    }
                }
            }
        }
        return result;
    }

    public static Employee maxSalary() {
        Employee result = EMPLOYEES[0];
        int maxSalary = MIN_VALUE;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            for (Employee employee : EMPLOYEES) {
                if (employee != null) {
                    if (maxSalary < employee.getSalary()) {
                        maxSalary = employee.getSalary();
                        result = employee;
                    }
                }
            }
        }
        return result;
    }

    public static float averageSalary() {
        float size = 0;
        float sum = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) {
                size++;
                sum = fullSalary() / size;
            }
        }
        return sum;
    }

    public static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void indexSalary(int index) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                int indexS = employee.getSalary();
                employee.setSalary((int) (indexS * (index / 100f + 1)));
            }
        }
    }

    public static Employee minSalaryDepartment(int department) {
        int minSalary = MAX_VALUE;
        Employee result = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee maxSalaryDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static float fullSalaryDepartment(int department) {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    }

    public static float avaSalaryDepartment(int department) {
        int membersCount = 0;
        int sum = 0;
        if (department <= 5) {
            for (Employee employee : EMPLOYEES) {
                if (employee != null) {
                    if (employee.getDepartment() == department) {
                        sum += employee.getSalary();
                        membersCount++;
                    }
                }
            }
        } else {
            System.out.println("Ошибка такого депортамента нет");
        }
        return sum / (float) membersCount;
    }

    public static void indexSalaryDeportment(int department, int index) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    int indexS = employee.getSalary();
                    employee.setSalary((int) (indexS * (index / 100f + 1)));
                }
            }
        }
    }

    public static void printDepartment(int department) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee);
                }
            }
        }
    }

    public static void printMinSalaryEmployee(int salary) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (salary > employee.getSalary()) {
                    System.out.println(employee);
                }
            }
        }
    }

    public static void printMaxSalaryEmployee(int salary) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (salary <= employee.getSalary()) {
                    System.out.println(employee);
                }
            }
        }
    }

    public static void creatEmployee(String fullName, int salary, int department) {
        int index = frindFreeIndex();
        if (index == -1) {
            System.out.println("Невозможно добавить сотрудника");
            return;
        }
        EMPLOYEES[index] = new Employee(fullName, salary, department);

    }

    public static int frindFreeIndex() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void removeEmloyee(String fullName) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) {
                if (EMPLOYEES[i].getFullName().equals(fullName)) {
                    EMPLOYEES[i] = null;
                }
            }
        }
    }

    public static void removeEmloyeeByIdi(int id) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] != null) {
                if (EMPLOYEES[i].getId() == id) {
                    EMPLOYEES[i] = null;
                }
            }
        }
    }

    public static void changSalary(String fullName, int salary) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getFullName().equals(fullName)) {
                    employee.setSalary(salary);
                }
            }
        }
    }

    public static void changSalarys(String fullName, int department) {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                if (employee.getFullName().equals(fullName)) {
                    employee.setDepartment(department);
                }
            }
        }
    }

    public static void printDepartment() {
        for (int i = 1; i <= DEPARTMENT_COUNT; i++) {
            System.out.println("Депортамент " + i + ":");
            for (Employee employee : EMPLOYEES) {
                if (employee != null) {
                    if (employee.getDepartment() == i) {
                        System.out.println(employee);
                    }
                }
            }
        }
    }
}