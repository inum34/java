
public class Linked_list {
    public static class Node {
    
        int data;
        Node next;
      
    }
    public static void Node(int data){
        this.data= data;
    }
public static void main(String[] args) {
    Node a= new Node(2);
    Node b= new Node(3);
    
    a.next= b;
    System.out.println(a.next.data);
}
    
}