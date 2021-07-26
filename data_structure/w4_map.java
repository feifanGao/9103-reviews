import java.util.HashMap; 
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
public class w4_map {
    public static void main(String[] b) { 
        Map<Character,Integer> map = new HashMap();
        System.out.print("Please input a string: ");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            for(char i : scan.nextLine().toCharArray()){
                if(map.containsKey(i))
                    map.put(i, map.get(i).intValue()+1);
                else    
                    map.put(i, 1);
            }
            System.out.print("{");
            for(Entry<Character, Integer> e : map.entrySet())
                System.out.print(e.getKey() + "=" + e.getValue() + ", ");
            System.out.println("}");
            System.out.print("Please input a string: ");
        }

    }
}
