package com.company;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String midlename;
    private int birthdate;
    private String address;
    private String telefone;
    private String department;
    private String curs;
    private String group;


    public Student(int id, String surname, String name, String midlename, int birthdate, String address, String telefone, String department, String curs, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.midlename = midlename;
        this.birthdate = birthdate;
        this.address = address;
        this.telefone = telefone;
        this.department = department;
        this.curs = curs;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMidlename(String midlename) {
        this.midlename = midlename;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMidlename() {
        return midlename;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDepartment() {
        return department;
    }

    public String getCurs() {
        return curs;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", midlename='" + midlename + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", telefone=" + telefone +
                ", department='" + department + '\'' +
                ", curs='" + curs + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
