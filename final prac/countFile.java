import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.io.FileNotFoundException;

public class countFile {
    public static void countWord(String filename){
        File f = new File(filename);
        int size = 0;
        try{
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()){
                String[] s = scan.nextLine().split(" ");
                size += s.length;
            }
            if(size==0)
                System.out.println("The file is empty");
            else
                System.out.println("There are "+size+" words in "+filename+".");
        }catch(FileNotFoundException e){
            System.err.println("No such file");
        }
    }

    public static void main(String[] args){
        countWord("b.txt");
    }
}
