
/**
 * REcursion:a function calls itself called recursion..
 * iteration /loops ..
 * itiration =recursion almost similar..
 */

// // 
// /**
//  * re_Cursion
//  */
// public class re_Cursion {

//     public static void calculate_sum(int i, int n, int sum) {
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }

//         sum += i;
//         calculate_sum(i + 1, n, sum);

//     }

//     public static void main(String[] args) {
//         calculate_sum(1, 5, 0);
//     }
// }
/**
 * re_Cursion
 */
// public class re_Cursion {
//     public static int calc_factorial(int n) {
//         if (n == 1 || n == 0) {
//             return 1;
//         }
//         int fact_nm1 = calc_factorial(n - 1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int fact_ans = calc_factorial(n);
//         System.out.println(fact_ans);

//     }
// }
/**
 * re_Cursion
 */
public class re_Cursion {
        public static void calc_fib(int a ,int b ,int n){
            if (n==0) {
                return;

            }
                    int c=a+b;
                    System.err.println(c);
                    calc_fib(b, c, n-1);
        }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        calc_fib(a,b,n-2);
    }
}