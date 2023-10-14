package homework.medicalCenter;

import java.util.Scanner;

public class Storage {
    private Doctor[] doctors = new Doctor[10];
    Scanner scanner = new Scanner(System.in);
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public void searchProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().contains(profession)) {
                System.out.println(doctors[i].getId() + " " + doctors[i].getName() + " " +
                        doctors[i].getSurname() + " " + doctors[i].getEmail() + " " + doctors[i].getPhoneNumber() + " " + doctors[i].getProfession());
            }
        }
    }

    public void deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                for (int j = 0; j < size; j++) {
                    doctors[j] = doctors[j + 1];
                }
                size--;
                break;
            }
        }
    }

    public void changeDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                System.out.println("Please input doctor new name");
                String name = scanner.nextLine();
                doctors[i].setName(name);
                System.out.println("Please input doctor new surname");
                String surname = scanner.nextLine();
                doctors[i].setSurname(surname);
                System.out.println("Please input doctor new email");
                String email = scanner.nextLine();
                doctors[i].setEmail(email);
                System.out.println("Please input doctor new phoneNumber");
                String phoneNumber = scanner.nextLine();
                doctors[i].setPhoneNumber(phoneNumber);
                System.out.println("Please input doctor new profession");
                String profession = scanner.nextLine();
                doctors[i].setProfession(profession);

            }
        }
    }

    private Patient[] patients = new Patient[10];
    private int patientSize;

    public void addPatient(Patient patient) {
        if (patientSize == patients.length) {
            extendPatient();
        }
        patients[patientSize++] = patient;
    }

    private void extendPatient() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;
    }

    public void printByDoctor(String doctor) {
        for (int i = 0; i < patientSize; i++) {
            if (patients[i].getDoctor().contains(doctor)) {
                System.out.println(patients[i].getId() + " " + patients[i].getName() + " " + patients[i].getSurname() + " " +
                        patients[i].getPhone() + " " + patients[i].getDoctor() + " " + patients[i].getRegisterDateTime());
            }

        }
    }

    public void print() {
        for (int i = 0; i < patientSize; i++) {
            System.out.println(patients[i].getId() + " " + patients[i].getName() + " " + patients[i].getSurname() + " " +
                    patients[i].getPhone() + " " + patients[i].getDoctor() + " " + patients[i].getRegisterDateTime());
        }
    }
}