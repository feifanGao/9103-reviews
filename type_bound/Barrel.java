import java.util.*;
public class Barrel<T extends Liquid> {
    private List<T> liquids;
    public Barrel() {
        liquids = new ArrayList<T>();
    }
    public void add(T liquid) { 
        liquids.add(liquid);
    }
    public void outputVolume() { 
        double total = 0.0;
        for(T e : liquids) {
            total += e.getLitres();
            System.out.println(e + ": " + e.getLitres() + "L"); 
        }
        System.out.println("Total: " + total + "L\n"); 
    }
    public static void main(String[] args) { 
        Barrel<Water> waterBarrel = new Barrel<Water>(); 
        Barrel<Oil> oilBarrel = new Barrel<Oil>(); 
        Barrel<Liquid> mixedBarrel = new Barrel<Liquid>();

        waterBarrel.add(new Water(1.0)); 
        waterBarrel.add(new Water(2.0)); 
        
        waterBarrel.outputVolume();

        oilBarrel.add(new Oil(1.0)); 
        oilBarrel.add(new Oil(2.0)); 
        
        oilBarrel.outputVolume();

        mixedBarrel.add(new Water(1.0)); 
        mixedBarrel.add(new Oil(2.0)); 
        
        mixedBarrel.outputVolume();
    }
}
