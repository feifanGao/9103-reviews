import java.util.List;
import java.util.ArrayList;
public abstract class w6_abstract {
    private String name;
    private List parts;

    public w6_abstract(String name) {
        this.name = name;
        this.parts = new ArrayList<String>();
    }

    public void addPart(String p){
        parts.add(p);
    }

    public abstract void stack(w6_abstract f);
}
