import java.util.Scanner;
import java.util.LinkedList;

public class w4_linkedlist{
    public static void main(String[] args){
        LinkedList<Integer> a = new LinkedList<Integer>();
        
        Scanner s = new Scanner(System.in);

        while(s.hasNext())
            a.add(s.nextInt());
        
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i));//ctrl D
    }
}
