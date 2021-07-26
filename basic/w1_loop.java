import java.util.ArrayList;
public class w1_loop {
    static void do_loop(int n){
        //int n = 0;
        do { 
            System.out.println(n);
            n--;
        } while (n>0);
        
    }
    static void while_loop(int n){
        //int n = 0;
        while (n>0){ 
            System.out.println(n);
            n--;
        }
    }
    static void for_loop(int n){
        for(; n > 0; n--)
            System.out.println(n);
    }

    static void for_each_loop(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(; n > 0; n--)
            list.add(n);
        for( int i : list )
            System.out.println(i);
    }

    static void array_example(int n){
        int[] numbers = new int[16];

        int[] numbers2 = {1, 2, 3, 4};

        int[] numbers3 = new int[] {1, 2, 3, 4};
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        for_each_loop(i);
    }
}
