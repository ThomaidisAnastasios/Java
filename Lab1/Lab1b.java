/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
        Scanner key;
        key= new Scanner(System.in);
        int input, max=0 , min=0, counter = 0, sum = 0;
        double average = 0.0;
       do
        {
                  System.out.print("Dvste arnitiko arithmo");
            input=key.nextInt();
            if (input < 0) {
                

            if (counter==0) min=max=input;
            if(input>max) max=input;
            if(input<min) min=input;
            counter++;
            sum+=input;
            }
      
      
   }while (input!=555);
          

      if(counter!=0) average=(float)sum/(float)counter;
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Average: " + average);
    }
}
