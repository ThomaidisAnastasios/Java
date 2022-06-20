package gradebook;
import java.util.Scanner;

public class Grade {
    private String StudentName;
    private double grade;
    public Grade()
    {
        StudentName="";
        grade=0;
    }
    public void ReadGrade()
    {
       Scanner input=new Scanner(System.in);
       System.out.print("Give student name:");
       StudentName=input.nextLine();
       System.out.print("Give student grade:");
       grade=input.nextDouble();
    }
     public void PrintGrade()
    {
      
       System.out.print("Student name: " + StudentName);
       System.out.print("\nStudent grade :"+ grade + "\n");
       
    }
    public double GetGrade()
    {
        return grade;
    }
    }


