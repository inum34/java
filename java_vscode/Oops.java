// class pen{
//     String color;
//     String  type;
//     public void write(){
//         System.out.println("write something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }


// public class Oops {
//     public static void main(String[] args) {
//         pen pen1= new pen();
//         pen1.color="blue";
//         pen1.type="gel";
//         pen1.write();
//         pen pen2=new pen();
//         pen2.color= "black";

//         pen1.printColor();
//         pen2.printColor();
//     }
// }
 
/**
 * Oops
 */

//  class Student{
// String name;
// int age;
// public void printColor(){
//             System.out.println(this.age);
//             System.out.println(this.name);
//         }
     

//         Student(String name, int age){
//             this.name= name;
//             this. age= age;
//         }

//  }
// public class Oops {
// public static void main(String[] args) {
//     Student st=new Student(null, 0);
//     st.age=19;
//     st.name="chetan";
//     Student s1 =new Student("nuamanl", 12);
   
//   s1.printColor();
//     st.printColor();
// }
    
// }
/*
 * 
 * polymorphism
 */
// class Student{
//     String name;
//     int age;

//     public static void  printInfo(int age){
//             System.out.println(age);
//     }
//     public static void printInfo(String name){
//                 System.out.println(name);
//     }

//     public void printInfo(String name,int age){
//         System.out.println(name +" "+ age);
//     }

// }
// public class Oops {
// public static void main(String[] args) {
//     Student s1= new Student();
//     s1.name="chetan";
//     s1.age=19;
//    s1.printInfo(s1.name,s1.age);
// }
    
// }


/*inheritance */
/**
 * Oops
 */
// class Shape{
//     String color;
//     public  static void area(){
//         System.out.println("displays area");
//     }

// }
// class Triangle extends Shape{
//         public static void area(int l, int b){
//                 System.out.println(1/2*l*b);
//         }
// }

// class Circle extends Shape{
//     public void area(int r){
//             System.out.println(3.14*r*r);
//     }
// }


// public class Oops {

//      public static void main(String[] args) {
//         Triangle t1= new Triangle();
//         t1. color="red";

//      }
// }

/*encapsulation
 * //packages 
 * types of packages 1. built in packages
 * 2. self made packages
 */


// import bank.*;
// public class Oops {

//     public static void main(String[] args) {
//         bank.Account account1= new Account();
//         account1.name="customer1";
//     }
// }
/**
 * Oops
 */

  /**
   * Oops
   */
  public class Oops {
  static class Student_class{
    String name;
    int roll;
    double prcnt;
  }
    public static void main(String[] args) {
        Student_class x= new Student_class();
        x.name="chetan";
        x.roll=1103;
        x.prcnt=68.69;
        System.out.println(x.name);
        System.out.println(x.roll);
        System.out.println(x.prcnt);



    }
  }