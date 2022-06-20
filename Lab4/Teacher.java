package teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Teacher {
     private ArrayList<Course> Courses = new ArrayList<>();
     private String teacher;
     public Teacher()
     {
         Courses=new ArrayList();
         teacher="";
     }
     public void readTeacher()
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Give teacher's name:");
       teacher=input.nextLine();
      

    } 
     public void readCourses()
     {
      
       Course g=new Course();
       g.ReadCourse();
       Courses.add(g);

    } 
    public void printData()
     {
       
       System.out.print("Teacher's name:" +teacher);
       System.out.print("\nCourses:\n");

      Course e=new Course();
       
      for (Course elem :Courses)
      {
          elem.PrintGrade();
      }
      
      
    }  
    public float calcsal()
    {
     
        float salary=0;
 
        Iterator itr=Courses.iterator();
        while(itr.hasNext()){
           
             Course a=(Course) itr.next();
             salary+=a.GetSalary();
             
        }
        return salary;
    }
    

    public static void main(String[] args) {
        Teacher gb=new Teacher();
       gb.readTeacher();
        for(int i=0;i<3;i++) {
            gb.readCourses();
        }
        gb.printData();
        System.out.print("\nThe total salary:"+gb.calcsal());
    }
}
