import java.util.*;

public class Practice {
    static int numBER(int p,int q){
        if (p==1||q==1) {
            return 1;
        }
        int smallPortion= numBER(q);
    }

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
            int p= sc.nextInt();
            int q= sc.nextInt();

    }
}