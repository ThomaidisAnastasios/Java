package testinheritance;

public class TestInheritance {

    public static void main(String[] args) {
       Employee e2= new Employee();
       Employee e1= new Employee("George",6, 45);
       Employee e3= new CommissionEmployee();
       e1.PrintEmployee();
       System.out.println("The salary is" +e1.CalcSal());
       e2.ReadEmployee();
       e2.PrintEmployee();
       System.out.println("The salary is" +e2.CalcSal());
       e3.ReadEmployee();
       e3.PrintEmployee();
       System.out.println("The salary is" +e3.CalcSal());
    }
}


