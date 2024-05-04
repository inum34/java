import java.util.ArrayList;
import java.util.Collections;


public class Array_list {
      public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<Integer>();
    
        // add element
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);
        // get element
  int element= list.get(2);
 System.out.println(element);
 //add el iin between
 list.add(1,1);
 System.out.println(list);
      
        // set ele
        list.set(0, 5);
        System.out.println(list);
        //remove element 
        list.remove(3);
        // size
        int size= list.size();
        System.out.println(size);
        // iterate
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println();
        //sorting 
        Collections .sort(list);
        System.out.println(list);
      }

}

