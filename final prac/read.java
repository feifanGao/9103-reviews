import java.io.File;
import java.util.*;
import java.util.*;

public class read{
    public static void readScore(){
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String[] a = scan.nextLine().split(" ");
            int score = Integer.parseInt(a[1]);
            students.put(a[0],score);
            if(score>100 || score<0)   
                System.out.println(a[0]+" score is not valid");
        }

        System.out.print("Passed students: ");
        for(Map.Entry<String, Integer> entry : students.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(value>=50 && value<=100)
                System.out.print(key+" ");
        }
        System.out.println("");

        System.out.print("Failed students: ");
        for(Map.Entry<String, Integer> entry : students.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(value>=0 && value<50)
                System.out.print(key+" ");
        }
        System.out.println("");


    } 
    public static void main(String[] args){
        readScore();
    }
}
