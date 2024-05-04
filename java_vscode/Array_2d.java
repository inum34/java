import java.util.*;

public class Array_2d {
    public static void main(String[] args) {
        try (// memory consumption = (row*coloumn)*byte of data type
                // int [][]arrayname=new type [][]
                // int[][]matrix=new int[1,3];
        Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int coloumn = sc.nextInt();
            int[][] numbers = new int[row][coloumn];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < coloumn; j++) {
                        numbers[i][j]=sc.nextInt();
                    }
            
                }
                for (int i = 0; i <row; i++) {
                    for (int j = 0; j < coloumn; j++) {
                        System.out.println(numbers[i][j]);

                    }
                   
                }
        }
        System.out.println();
    }
}
