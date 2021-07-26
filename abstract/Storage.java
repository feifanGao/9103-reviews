import java.util.List;
import java.util.ArrayList;
public abstract class Storage<T>{
    public List<T> parts;

    public Storage(){
        this.parts = new ArrayList<T>();
    }

    public abstract void print();
    public void add(T element){
        if(element==null) return;
        for(T ele:parts){
            if(ele.equals(element))
                return;
        }
        parts.add(element);
    }
}
