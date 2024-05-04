/**
 * Array
 * type[]arrayName=newtype[size];
 * array declaration
 * // int[] marks = new int[3];
        // marks[0] = 89;
        // marks[1] = 88;
        // marks[2] = 87;
        // System.out.println(marks[2]);
        // for iterative method
        //  for (int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        //  }
 */
import java.util.*;


public class Array {
   public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
        int size = sc.nextInt();
          String names[] = new String[size];


          //input
          for(int i=0; i<size; i++) {
              names[i] = sc.next();
          }
         
          //output
           for(int i=0; i<names.length; i++) {
               System.out.println("name " + (i+1) +" is : " + names[i]);
           }
    }
      
   }
}




