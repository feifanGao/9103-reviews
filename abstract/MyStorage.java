import java.util.List;
import java.util.ArrayList;
public class MyStorage<T> extends Storage<T>{
    public MyStorage() {
        super();
    }

    public void print(){
        for(T ele:parts){
            System.out.println(ele);
        }
    }

    public static void main(String[] args){
        MyStorage<String> r = new MyStorage<String>();
        r.add("gaf");
        r.add("egaf");
        r.add("gaf");
        r.print();

    }

}
