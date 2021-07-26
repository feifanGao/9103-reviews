public class w2_cupcake { 
    public boolean delicious; 
    public String name;
    public boolean eaten;
    public w2_cupcake(boolean delicious, String name) {
        this.delicious = delicious;
        this.name = name;
    }
    public void setName(String n) { name = n; }
    public String getName() { return name; }

    public static void main(String[] args) {
        w2_cupcake mine = new w2_cupcake(true,"garlic bread"); 
        mine.setName("厄加特");
        System.out.println(mine.name); 
    }
}
