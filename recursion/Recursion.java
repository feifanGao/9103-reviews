public class Recursion {
    public static double compoundInterests(double amount ,int month){
        if(month==0){
            return amount;
        }else{
            return compoundInterests(amount,month-1)*1.005;
        }
    }

    public static void main(String[] args) {
        double t = compoundInterests(100,12);
        System.out.println(t);
    }
}
