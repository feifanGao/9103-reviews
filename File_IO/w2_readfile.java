import java.io.File;
import java.util.Scanner;

public class w2_readfile {
    public static void main(String[] args){
        File f = new File("README.txt");
        try{
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine())
                System.out.println(scan.nextLine());
        }catch(Exception e){
            System.err.println("no file found!");
        }
    }
}
