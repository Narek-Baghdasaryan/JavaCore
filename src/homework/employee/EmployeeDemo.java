package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee ID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input employee salary");
                    int salary =Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input employee company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name,surname,employeeID,salary,company,position);
                    employeeStorage.add(employee);
                    System.out.println("EMPLOYEE CREATED!");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employee ID");
                    String ID = scanner.nextLine();
                    employeeStorage.searchID(ID);
                    break;
                case "4":
                    System.out.println("Please input employee company");
                    String Company = scanner.nextLine();
                    employeeStorage.searchCompany(Company);
                    break;
                default:
                    System.out.println("There is no such command. Try again!");
            }
        }
    }
}
