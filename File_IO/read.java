import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class read{
    public static void readLongLines(String fileName, int length){
        File f = new File(fileName);
        try{
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()){
                String a = scan.nextLine();
                if(a.length()>length){
                    System.out.println(a);
                }else if(a.length()<0){
                    System.out.println("Invalid length");
                }
            }
        }catch(FileNotFoundException e){
            System.err.println("No such file");
        }
    } 
    public static void main(String[] args){
        readLongLines("fileName.txt", 4);
    }
}
