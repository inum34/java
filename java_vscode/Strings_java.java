import java.util.*;

public class Strings_java {
    public static void main(String[] args) {
        try (// String declration
                // String name= "chetan ";
                // String sentence= "my name is chetan ";
        Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            System.out.println(name);
        }
        // concatenation
        String firstname = "chetan";
        String lastname = "chaudhary";
        String fullname = firstname + "" + lastname;
        System.out.println(fullname);
        // char at
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
        //compare
        String name1="tony";
        String name2="tony";
        if (name1.compareTo(name2)==0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
