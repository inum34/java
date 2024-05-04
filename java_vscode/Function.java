 import java.util.*;

 public class Function {
//     public static int printsuM(int a, int b) {
//         int pro;
//         pro = a * b;
//         return pro;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int pro = printsuM(a, b);
//         System.out.println(pro);
//     }
// public static void printAverage(int a,int b,int c){
//     int add ;
//     add=a+b+c;
//     int average;
//     average= add/3;
//    System.out.println(average);
   
// 
public static void printGreater(int a,int b){
    if (a>b) {
        System.out.println("greater is "+a);
    }else{
        System.out.println("greater is "+ b);
    }
    return;
}

public static void main(String[] args) {
   try (Scanner sc = new Scanner(System.in)) {
    int a= sc.nextInt();
       int b= sc.nextInt();
       printGreater(a, b);
}
}

}
