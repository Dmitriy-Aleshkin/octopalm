package App.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student {
    //Переменные класса Student
    String firstName; //Имя
    String lastName; //Фамилия
    String Group; //Группа
    double averageMark;//Средняя оценка
    int Scholarship;

    public Student(String firstName, String lastName, String Group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Group = Group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return Group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void getScholarship() {
        if (averageMark == 5) {
            Scholarship = 100;
        } else if (averageMark != 5) {
            Scholarship = 80;
        }
        System.out.println(lastName + " " + firstName + " "
                + "из группы " + Group
                + " получает стипендию в размере " + Scholarship + " тугриков");
    }

    public static void main(String[] args) {
        Student Ivan = new Aspirant("Иван", "Иванов", "Buh", 5);
        Student Mikhail = new Student("Михаил", "Михайлов", "Buh", 2.15);
        Student Filimon = new Student("Филимон", "Филимоно", "Buh", 4.96);
        Student Leopold = new Student("Леопольд", "Леопольдов", "Buh", 3.11);
        Student Serafim = new Student("Серафим", "Серафимов", "Buh", 5);
        Student Efrosinya = new Aspirant("Ефросинья", "Ефросиньева", "Buh", 3.26);
        Student Karmelita = new Aspirant("Кармелита", "Кармелитова", "Buh", 4.15);

        Ivan.getScholarship();
        Mikhail.getScholarship();
        Filimon.getScholarship();
        Leopold.getScholarship();
        Serafim.getScholarship();
        Efrosinya.getScholarship();
        Karmelita.getScholarship();
    }
}