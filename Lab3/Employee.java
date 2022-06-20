
package employee_shop;
import java.util.Scanner;

public class Employee {

    private String name;
    private int age;
    private Shop theShop;
 
    Employee() {
    }

    Employee(String n, int a, Shop s) {
        name = n;
        age = a;
        theShop = s;
        
    }
     Employee(String n, int a, String s1, String a1) {
        name = n;
        age = a;
        theShop = new Shop(s1,a1);
       
    }
    
    public void print() {
        System.out.println("--------");
        System.out.println("Employee");
        System.out.println("--------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Shop: " + theShop.getName());
        System.out.println("Shop: " + theShop.getAddress());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Shop getTheShop() {
        return theShop;
    }
   
    public double calculatePay()
    {
        Scanner input= new Scanner(System.in); 
        System.out.print( "Enter how many hours worked: " );
        int hours = input.nextInt();

        System.out.print( "Enter hourly rate: " );
        double rate = input.nextInt();
        double pay;
        if ( hours > 40 )
        { 
        int extraHours = hours - 40;
        pay = ( 40 * rate ) + ( extraHours * rate*1.15);
        }
        else pay = hours * rate;
        return pay;
  }
}

