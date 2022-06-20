
package employee_shop;

public class Employee_Shop {


    public static void main(String[] args) {
        Shop s = new Shop("multirama", "Kozani");
        Employee emp = new Employee("George", 29, s);
        Shop s1 = new Shop("public", "Kozani");
        Employee emp1 = new Employee("Matina", 59, "Plaisio", "Kozani");
        Employee emp2 = new Employee("Kostas", 25,s1);
        emp.print();
        emp1.print();
        emp2.print();
        System.out.println("Salary:"+emp1.calculatePay());
       
        
    }
}
