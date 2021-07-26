import java.util.HashMap;

public class FibonacciSequence{

    static HashMap<Integer, int[]> cache = new HashMap<Integer, int[]>();

    public static int[] generateSequenceMem(int n){

        if(cache.containsKey(n)){
            return cache.get(n);
        }
        else{ 
            if(n ==0)
                return new int[]{0};
            else if(n ==1)
                return new int[]{0,1};
            else{

                int[] s1 = generateSequenceMem(n-1);
                int[] s2 = generateSequenceMem(n-2);

                int[] newSequence = new int[s1.length +1];

                for(int i=0; i< s1.length; ++i)
                    newSequence[i] = s1[i];
                newSequence[newSequence.length -1] = s1[s1.length-1] + s2[s2.length-1];
                cache.put(n, newSequence);
                return newSequence;
            }
        }
    }


    public static int[] generateSequence(int n){
        if(n ==0)
            return new int[]{0};
        else if(n ==1)
            return new int[]{0,1};
        else{

            int[] s1 = generateSequence(n-1);
            int[] s2 = generateSequence(n-2);

            int[] newSequence = new int[s1.length +1];

            for(int i=0; i< s1.length; ++i)
                newSequence[i] = s1[i];
            newSequence[newSequence.length -1] = s1[s1.length-1] + s2[s2.length-1];
            return newSequence;
        }
    }

    public static void main(String[] args){


        long startTime = System.currentTimeMillis();
        int[] s = generateSequence(40);
        for(int n : s)
            System.out.print(n + " ");
        System.out.println("\nTime in ms: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        int[] sm = generateSequenceMem(40);
        for(int n : sm)
            System.out.print(n + " ");
        System.out.println("\nTime in ms: " + (System.currentTimeMillis() - startTime));
    }
}
