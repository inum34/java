// public class Sorting_type {
//     public static void printArray(int arr[]){
//                 for (int i = 0; i < arr.length; i++) {
//                     System.out.println(arr[i]+" ");
//                 }
//                 System.out.println();
//     }
//     public static void main(String[] args) {
//         // sorting in java
//         // 1. bubble sort
//         int arr[] = { 7, 8, 3, 1, 2 };
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;

//                 }
//             }

//         }
//         printArray(arr);
//     }
// }
//****************
/**
 * Sorting_type
 */
public class Sorting_type {

    public static void main(String[] args) {
        //selection sort
          int arr[]={7,8,3,2,1};
          for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                        if (arr[smallest]>arr[j ]) {
                            smallest=j;
                        }
            }
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            
          }
          
    }
}