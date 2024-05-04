import java.util.*;
 
public class Loops {
 
    public static void main(String[] args) {
        try (//number
    Scanner sc = new Scanner(System.in)) {
        int n= sc.nextInt();
             
            //print all even numbers <=n 
            int i=1;
            while (i<=n) {
                //check if i is exactly divisible by 2
                if (i%2==0) {
                    System.out.print(i+"  ");
                }
                i++;
            }
    }
    }
}