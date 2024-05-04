public class Stringbuider {
        public static void main(String[] args) {
             StringBuilder sb= new StringBuilder("tony");
             System.out.println(sb);  
        //      char at index 2
             System.out.println(sb.charAt(2));
             //set char at 0
             sb.setCharAt(0, 'p');
             System.out.println(sb);
             //insert  a string
             sb.insert(2, 'n');
             System.out.println(sb);
             // delete the character
             sb.delete(2, 3);
             System.out.println(sb);
             // append
             sb.append("l");
             sb.append("l");
             System.out.println(sb);
        }
}
