interface SayHello {
    public default void howAreYou() { hello(); System.out.println("How are you today?"); } 
    public void hello();
}
public class Hello {
    public static void main(String[] args) {
        SayHello hi = () -> { 
            System.out.println("Hello!");
        };
        hi.howAreYou(); 
    }
}
