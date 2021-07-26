import java.util.ArrayList; 
public class w4_arraylist {
    public static void main(String[] b) { 
        ArrayList<String> list = new ArrayList<String>();
        list.add("First String!"); 
        list.add("Second String!"); 
        list.add("Woof!!");//补位
        list.remove(1);
        list.set(1, "Meow"); 
        System.out.println(list.get(0)); 
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    } 
}
