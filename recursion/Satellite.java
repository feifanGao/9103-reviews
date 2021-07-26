import java.util.HashMap;

public class Satellite{
    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    
    public int generateSatelliteMem(int n){
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        else{ 
            if(n<4)
                return 1;
            else{
                int r = generateSatelliteMem(n-2) + generateSatelliteMem(n-3);
                cache.put(n, r);
                return r;
            }
        }
    }

    public static void main(String[] args){
    }
}
