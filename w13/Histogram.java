import java.util.*;

public class Histogram {
    public static void main(String[] args){
        HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
        Scanner scan = new Scanner(System.in);
        //int key = scan.nextInt();
        while(scan.hasNext()){
            int key = scan.nextInt();
            if(key == -1) break;
            if(m.containsKey(key)){
                m.put(key, m.get(key)+1);
            }else{
                m.put(key, 1);
            }
        }
        for(Integer k : m.keySet()){////////////
            System.out.printf("The number %d occurs %d times.\n", k, m.get(k));
        }
    }
}
