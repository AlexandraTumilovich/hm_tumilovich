package hw3.task1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // Задача №1. Тестирование класса Student
        // Создадим 6 разных студентов
        Student student1 = new Student("Andrey", "Smirnov", "03.03.2002", 1);
        Student student2 = new Student("Olga", "Petuhova", "04.04.2002", 1);
        Student student3 = new Student("Ivan", "Ivanov", "01.01.2001", 2);
        Student student4 = new Student("Vasya", "Petrov", "02.02.2001", 2);
        Student student5 = new Student("Lena", "Suvorova", "05.05.2000", 3);
        Student student6 = new Student("Ira", "Sidorova", "06.06.2000", 3);

        //Создадим список студентов
        ArrayList<Student> student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student6);

        //Протестируем метод printStudents и ввыведем в консоль всех студентов первого и третьего курса
        Student.printStudents(student, 1);
        Student.printStudents(student, 3);

        //Протестируем геттеры и выведем в консоль имя первого студента
        System.out.println("\nПервый студент: " + student1.getName() + " " + student1.getSurname() + " " + student1.getDateOfBirth() + " " + student1.getCourse());

        //Протестируем сеттеры
        student1.setName("NeAndrey");
        student1.setSurname("NeSmirnov");
        student1.setDateOfBirth("12.12.2003");
        student1.setCourse(5);
        System.out.println("\nПервый студент после изменения: " + student1.getName() + " " + student1.getSurname() + " " + student1.getDateOfBirth() + " " + student1.getCourse());
    }
}
