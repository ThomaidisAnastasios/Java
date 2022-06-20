/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author matina
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      long days;
      long distance;
      int  speed=186000;//miles per second
      Scanner input;
      input=new Scanner(System.in);
      System.out.println("Eisagete arithmo imeron \n\n\n");
      days=input.nextInt();
      distance=(days*24*3600)*speed;
      System.out.printf("%-15s %15s\n","Ημέρες","Απόσταση"); 
      System.out.printf("%-15d %15d\n", days,speed);
      System.out.println(distance);
     
               
      
    }
}
 