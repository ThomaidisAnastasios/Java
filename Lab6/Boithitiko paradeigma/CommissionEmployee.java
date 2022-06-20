package testinheritance;

import java.util.Scanner;

public class CommissionEmployee extends Employee{    

    private double commission;
    
    public CommissionEmployee()
    {
        
    }
    public CommissionEmployee(String n, double p, int h, double  c)
    {
     super(n,p,h);
     commission=c;
    }
    
    public void PrintEmployee()
    {
        super.PrintEmployee();
        System.out.println("Commissiom: "+ commission);

   
    }
    public void ReadEmployee()
    {
     
     super.ReadEmployee();
     Scanner input=new Scanner(System.in);
     System.out.println("Employee Commission:");
     commission=input.nextFloat();

    }
    
    public double CalcSal()
    {
    return super.CalcSal()+commission*4;
   
    }
    
}
