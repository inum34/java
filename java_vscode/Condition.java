/**
 * Condition
 */
import java.util.*;
public class Condition {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int month= sc.nextInt();
            System.out.println(month);
            switch (month) {
                case 1:System.out.println("january");
                    
                    break;
                case 2:
                System.out.println("november");
                break ;
                default:
                    break;
            }
        }

    }
}