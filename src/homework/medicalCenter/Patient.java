package homework.medicalCenter;

import java.util.Date;

public class Patient {
    private String id;

    private String name;

    private String surname;

    private String phone;

    private String doctor;

    private String registerDateTime;

    public Patient() {
    }

    public Patient(String id, String name, String surname, String phone, String doctor, String registerDateTime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }
}
