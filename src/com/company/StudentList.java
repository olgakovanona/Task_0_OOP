package com.company;

import java.util.Arrays;

public class StudentList {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Kovanova", "Olga", "Evgenevna", 1983, "Kharkov", "0679228372", "KIT", "2", "4");
        students[1] = new Student(2, "Kolesnikov", "Kostya", "Inanovich", 1982, "Lviv", "0982337621", "KIT", "1", "2");
        students[2] = new Student(3, "Sharicov", "Sergey", "Olegovna", 1984, "Kiev", "0634229030", "AP", "2", "2");
        students[3] = new Student(4, "Korovyanskaya", "Maria", "Igorevna", 1984, "Kharkov", "0503390330", "KIT", "3", "1");
        students[4] = new Student(5, "Lenskaya", "Lida", "Aleksandrovna", 1983, "Kharkov", "0976221283", "KIT", "1", "3");

        ListOfStudensByFaculty(students);
        System.out.println();
        ListofStudentByGroup(students);
        System.out.println();
        ListOfStudentByBirthday(students);
        ListOfStudentByFacultyAndCurs(students);


    }

    // b)  списки студентов для каждого факультета и курса;

    private static void ListOfStudentByFacultyAndCurs(Student[] students) {
        System.out.println("List of student for 'KIT' faculty and '2' curs: ");
        for (int i = 0; i <students.length ; i++) {
            if (students[i].getDepartment().equals("KIT")&& students[i].getGroup().equals("2")){
                System.out.println(students[i]);
            }

        }

    }

    // c)  список студентов, родившихся после заданного года;

    private static void ListOfStudentByBirthday(Student[] students) {
        System.out.println("List of students who was born after 1983 year: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getBirthdate()>1983) {
                System.out.println(students[i]);
            }
        }
    }

  // d)  список учебной группы.

    private static void ListofStudentByGroup(Student[] students) {
        System.out.println("List of students of '2' group: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals("2")) {
                System.out.println(students[i]);
            }
        }
    }

    // a)  список студентов заданного факультета;
    private static void ListOfStudensByFaculty(Student[] students) {
        System.out.println("List of students of 'KIT' faculty: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDepartment().equals("KIT")) {
                System.out.println(students[i]);
            }

        }
    }


}


