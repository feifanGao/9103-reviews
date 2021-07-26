import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class w2_writefile {
    public static void main(String[] args){
        File f = new File("README.txt");
        try{
            PrintWriter writer = new PrintWriter(f);
            writer.println(1.0);
            writer.println(120);
            writer.println("My String!"); 
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
            //System.err.println("no file found!");
        }
    }
}
