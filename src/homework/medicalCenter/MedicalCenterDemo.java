package homework.medicalCenter;

import java.util.Scanner;

public class MedicalCenterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for add doctor");
            System.out.println("Please input 2 for search doctor by profession");
            System.out.println("Please input 3 for delete doctor by id");
            System.out.println("Please input 4 for change doctor by id");
            System.out.println("Please input 5 for add patient");
            System.out.println("Please input 6 for print all patients by doctor");
            System.out.println("Please input 7 for print all patients");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    method1(scanner, storage);
                    break;
                case "2":
                    method2(scanner, storage);
                    break;
                case "3":
                    System.out.println("please input id for remove");
                    String ID =scanner.nextLine();
                    storage.deleteById(ID);
                    break;
                case "4":
                    method4(scanner, storage);
                    break;
                case "5":
                    method5(scanner, storage);
                    break;
                case "6":
                    method6(scanner, storage);
                    break;
                case "7":
                    storage.print();
                    break;
                default:
                    System.out.println("invalid action");
                    break;

            }
        }
    }
    private static void method1(Scanner scanner, Storage storage) {
        System.out.println("please input doctor id");
        String id = scanner.nextLine();
        System.out.println("please input doctor name");
        String name = scanner.nextLine();
        System.out.println("please input doctor surname");
        String surname = scanner.nextLine();
        System.out.println("please input doctor email");
        String email = scanner.nextLine();
        System.out.println("please input doctor phonenumber ");
        String phonenumber = scanner.nextLine();
        System.out.println("please inout doctor profession");
        String profession= scanner.nextLine();
        Doctor doctor = new Doctor(id,name,surname,email,phonenumber,profession);
        storage.add(doctor);
        System.out.println("doctor created");
    }
    private static void method2(Scanner scanner, Storage storage) {
        System.out.println("please input profession");
        String keyword = scanner.nextLine();
        storage.searchProfession(keyword);
    }
    private static void method4(Scanner scanner, Storage storage) {
        System.out.println("please input id");
        String Id = scanner.nextLine();
        storage.changeDoctorById(Id);
    }
    private static void method5(Scanner scanner, Storage storage) {
        System.out.println("please input patient ID card number");
        String id = scanner.nextLine();
        System.out.println("please input patient name");
        String name = scanner.nextLine();
        System.out.println("please input patient surname");
        String surname = scanner.nextLine();
        System.out.println("please input patient phone");
        String phone = scanner.nextLine();
        System.out.println("please input patient doctor ");
        String doctor = scanner.nextLine();
        System.out.println("please input patient registerDateTime ");
        String registeredDateTime= scanner.nextLine();
        Patient patient = new Patient(id,name,surname,phone,doctor,registeredDateTime);
        storage.addPatient(patient);
        System.out.println("patient created");
    }
    private static void method6(Scanner scanner, Storage storage) {
        System.out.println("please input doctor");
        String Doctor= scanner.nextLine();
        storage.printByDoctor(Doctor);
    }
}
