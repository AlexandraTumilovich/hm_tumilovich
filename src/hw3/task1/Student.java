package hw3.task1;
/*
Создайте класс Student, описывающий студента университета.
В класс необходимо добавить:
- конструктор, инициализирующий поля класса name, surname, dateOfBirthday, course.
- геттеры и сеттеры для каждого поля.
- метод printStudents(List students, int course), который получает список студентов и номер курса и печатает в консоль имена тех студентов из списка, которые обучаются на данном курсе.
- для обхода списка студентов использовать цикл foreach.

Протестируйте работу класса Student.
 */

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private int course;

    public Student(String name, String surname, String dateOfBirth, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, int course) { // получает список студентов и номер курса и печатает в консоль имена тех студентов из списка, которые обучаются на данном курсе
        System.out.println("Студенты, учащиеся на курсе " + course + ":");
        for (Student student : students
        ) {
            if (student.getCourse() == course) System.out.println(student.getName() + " " + student.getSurname());
        }
        System.out.println();
    }
}
