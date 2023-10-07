package homework.employee;

import homework.dynamicarray.DynamicArray;

import java.util.Scanner;

public class EmployeeStorage {
    private Scanner scanner = new Scanner(System.in);
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());

        }
    }

    public void searchID(String ID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(ID)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }

        }
    }

    public void searchCompany(String Company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(Company)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }

    }

    public void DeleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                for (int j = i; j < size; j++) {
                    employees[j] = employees[j + 1];
                }
                size--;
                break;
            }

        }
    }
    public void ChangeEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)){
                    System.out.println("Please input your new name");
                    String name = scanner.nextLine();
                    employees[i].setName(name);
                    System.out.println("Please input your new surname");
                    String surname = scanner.nextLine();
                    employees[i].setSurname(surname);
                    System.out.println("Please input your new salary");
                    int salary = Integer.parseInt(scanner.nextLine());
                    employees[i].setSalary(salary);
                    System.out.println("Please input your new company");
                    String company = scanner.nextLine();
                    employees[i].setCompany(company);
                    System.out.println("Please input your new position");
                    String position = scanner.nextLine();
                    employees[i].setPosition(position);
                }
            }
        }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }



}