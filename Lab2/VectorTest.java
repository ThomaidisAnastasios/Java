
package vector;

public class VectorTest {

    public static void main(String[] args) {
       Vector v1=  new Vector();
       Vector v2=  new Vector();
       Vector v3;  
       
       v1.SetVector(1, 2);
       v2.ReadData();
       v3=new Vector(5,3);
       System.out.print("\nVector"+" v1");
       v1.PrintVector();
       System.out.println("Length:"+v1.Distance());
       System.out.println("\nVector"+" v2");
       v2.PrintVector();
       System.out.println("Length:"+v2.Distance());
       System.out.println("\nVector"+" v3");
       v3.PrintVector();
       System.out.println("Length:"+v3.Distance());
    }
}
