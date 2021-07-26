import java.util.*;
public class GuessingGame { 
    public static void main(String[] args) {
        int answer = Integer.parseInt(args[0]);
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess what number it is: ");
        while(scan.hasNext()){
            int guess = Integer.parseInt(scan.next());
            if(guess == answer){
                System.out.println("Correct!");
                break;
            }
            System.out.print("Incorrect guess, try again: ");
        }
    }    
}
