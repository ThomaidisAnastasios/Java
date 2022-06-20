package gradebook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Gradebook {
     private ArrayList<Grade> Grades = new ArrayList<>();
     private String teacher;
     public Gradebook()
     {
         Grades=new ArrayList();
         teacher="";
     }
     public void readTeacher()
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Give teacher's name:");
       teacher=input.nextLine();  

    } 
     public void readGrades()
     {
      
       Grade g=new Grade();
       g.ReadGrade();
       Grades.add(g);

    } 
    public void printData()
     {
       
       System.out.print("Teacher's name:" +teacher);
       System.out.print("\nGrades:\n");
 
        Grade e=new Grade();
       
      for (Grade elem :Grades)
      {
          elem.PrintGrade();
      }
      
      
    }  
    public float calcavg()
    {
     
        float avg=0;
        int no=0;
        Iterator itr=Grades.iterator();
        while(itr.hasNext()){
           
             Grade a=(Grade) itr.next();
             avg+=a.GetGrade();
             no++;
        }
        return avg/no;
    }
    

    public static void main(String[] args) {
        Gradebook gb=new Gradebook();
       gb.readTeacher();
        for(int i=0;i<3;i++) {
            gb.readGrades();
        }
        gb.printData();
        System.out.print("\nThe average:"+gb.calcavg());
    }
}
