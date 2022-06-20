
package vector;

import java.util.Scanner;
public class Vector {
    private int x,y;
     public Vector()
        {
         x=0;
         y=0;
        }
    public Vector(int x1,int y1)
        {
         x=x1;
         y=y1;
        }
    public void SetVector(int x1, int y1)
        {
         x=x1;
         y=y1;
        }
    public void ReadData()
    {  
           Scanner input=new Scanner(System.in) ;
          System.out.println("Give the x point of the vector:");
         x=input.nextInt();
           System.out.println("Give the y point of the vector:");
         y=input.nextInt();
        }
    
    public int getX()   
        {
        return x;   
        }
    public int getY()   
        {
        return y;   
        }
    public void PrintVector()   
        {
       System.out.println("("+x+","+y+")");  
        }
    public double Distance()
        {
       double length=Math.pow((double)x,2)-Math.pow((double)y,2);     
       double distance=Math.sqrt(Math.abs(length));
       return distance; 
        }
    
        }
               

