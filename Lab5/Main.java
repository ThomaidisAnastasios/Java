package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {


    private static void printMenu() {
        System.out.println("--------------");
        System.out.println("     Menu     ");
        System.out.println("--------------");
        System.out.println("1. Add student");
        System.out.println("2. Delete student");
        System.out.println("3. Print students");
        System.out.println("4. Student grade");
        System.out.println("0. Exit");
        System.out.print("Please give a choice (0,1,2,3 or 4):");
    }


    private static void addStudent(Scanner keyboard, Student s) {
        System.out.print("Give the name: ");
        s.setName(keyboard.next());
        System.out.print("Give the surname: ");
        s.setSurname(keyboard.next());
        System.out.print("Give the grade: ");
        s.setGrade(keyboard.nextInt());
    }


    private static void deleteStudent(ArrayList<Student> students, Scanner keyboard) {
        String name, surname;
        System.out.print("Give the name: ");
        name = keyboard.next();
        System.out.print("Give the surname: ");
        surname = keyboard.next();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student temp = it.next();
            if (temp.getName().equals(name) && temp.getSurname().equals(surname)) {
                it.remove();
                System.out.println("Student deleted!");
                break;
            }
        }
    }

    private static void printStudents(ArrayList<Student> students) {
        int counter = 1;
        for (Student s : students) {
            System.out.println("");
            System.out.println("Student " + counter++);
            System.out.println("Name: " + s.getName());
            System.out.println("Surname: " + s.getSurname());
            System.out.println("Grade: " + s.getGrade());
            System.out.println("");
        }
    }

    private static void searchGrade(ArrayList<Student> students, Scanner keyboard) {
        String name, surname;
        System.out.print("Give the name: ");
        name = keyboard.next();
        System.out.print("Give the surname: ");
        surname = keyboard.next();

        for (Student s : students) {
            if (s.getName().equals(name) && s.getSurname().equals(surname)) {
                System.out.println("The grade is " + s.getGrade());
            }
        }
    }


    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);


        do{
            printMenu();
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    Student s = new Student();
                    addStudent(keyboard, s);
                    students.add(s);
                    break;
                case 2:
                    deleteStudent(students, keyboard);
                    break;
                case 3:
                    printStudents(students);
                    break;
                case 4:
                    searchGrade(students, keyboard);
                    break;
            }
        } while (choice != 0);
    }
}

