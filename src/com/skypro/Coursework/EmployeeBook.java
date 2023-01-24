package com.skypro.Coursework;

public class EmployeeBook{
    private static final Integer DEPARTMENT_COUNT = 5;
    private static final Integer EMPLOYEES_SIZE = 10;
    private static final Employee[] employees = new Employee[EMPLOYEES_SIZE];

    public static void PrintEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int FullSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee maxSalary() {
        Employee resultOne = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                resultOne = employee;
            }
        }
        return resultOne;
    }

    public static float averageSalary() {
        return FullSalary() / (float) employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void indexSalary(int index) {
        for (Employee employee : employees) {
            int indexS = employee.getSalary();
                    employee.setSalary((int) (indexS * (index / 100f + 1)));
        }

    }

    public static Employee minSalaryDepartment(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee maxSalaryDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float fullSalaryDepartment(int department) {
        int membersCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                membersCount++;
            }
        }
        return sum;
    }
    public static float avaSalaryDepartment(int department) {
        int membersCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                membersCount++;
            }
        }
        return sum / (float) membersCount;
    }
    public static void indexSalaryDeportment(int department, int index) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int indexS = employee.getSalary();
                employee.setSalary((int) (indexS * (index / 100f + 1)));
            }
        }

    }

    public static void printDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    public static void printMinSalaryEmployee(int salary) {
        for (Employee employee : employees) {
            if (salary > employee.getSalary()) {
                System.out.println(employee);
            }
        }
    }

    public static void printMaxSalaryEmployee(int salary) {
        for (Employee employee : employees) {
            if (salary <= employee.getSalary()) {
                System.out.println(employee);
            }
        }
    }

    public static void creatEmployee(String fullName, int salary, int department) {
        int index = frindFreeIndex();
        if (index == -1) {
            System.out.println("Невозможно добавить сотрудника");
            return;
        }
            employees[index] = new Employee(fullName, salary, department);

    }

    public static int frindFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void removeEmloyee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
            }
        }
    }

    public void removeEmloyee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public static void changSalary(String fullName, int salary) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }
    public static void changSalarys(String fullName, int department) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setDepartment(department);
            }
        }
    }
    public static void printDepartment() {
        for (int i = 1; i <= DEPARTMENT_COUNT; i++) {
            System.out.println("Депортамент " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee);
                }
            }
        }
    }
}