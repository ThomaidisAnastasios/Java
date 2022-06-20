package testinheritance;

import java.util.Scanner;

public class Employee {

    private String name;
    private double payhour;
    private int noofhours;

    public Employee() {
    }

    public Employee(String n, double p, int h) {
        name = n;
        payhour = (p < 0) ? 0 : p;
        noofhours = (h< 0) ? 0 : h;
    }

    public void PrintEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Pay hour: " + payhour);
        System.out.println("No of hours: " + noofhours);

    }

    public void ReadEmployee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Employee Name:");
        name = input.nextLine();
        System.out.println("Employee hour payment:");
        payhour = input.nextFloat();
        System.out.println("Employee working hours per week:");
        noofhours = input.nextInt();

    }

    public double CalcSal() {
        return payhour * noofhours * 4;

    }
}
