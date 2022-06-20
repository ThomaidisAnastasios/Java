package teacher;

import java.util.Scanner;

public class Course {
    
    private String CourseName;
    private double salary;
    public Course()
    {
        CourseName="";
        salary=0;
    }
    public void ReadCourse()
    {
       Scanner input=new Scanner(System.in);
       System.out.print("Give course name:");
       CourseName=input.nextLine();
       System.out.print("Give salary for this course:");
       salary=input.nextDouble();
    }
     public void PrintGrade()
    {
      
       System.out.print("Student name: " + CourseName);
       System.out.print("\nStudent grade :"+ salary + "\n");
       
    }
    public double GetSalary()
    {
        return salary;
    }
    }



