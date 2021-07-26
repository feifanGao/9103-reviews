import java.util.*;
class FamilyMember { 
    String name;
    List<FamilyMember> children;
    public FamilyMember(String name) { 
        this.name = name;
        children = new ArrayList<>();
    }
    public void addChildren(FamilyMember f){ 
        children.add(f);
    }
    public int countLeaf() {
        int count = 0;
        if(children.size()==0){
            return 1;
        }else{
            for(FamilyMember m:children){
                count+=m.countLeaf();
            }
        }
        return count;
    } 
    public static void main(String[] args){
        FamilyMember Liz = new FamilyMember("Liz");
        FamilyMember Sue = new FamilyMember("Sue");
        FamilyMember Joe = new FamilyMember("Joe");
        FamilyMember Max = new FamilyMember("Max");
        FamilyMember Ali = new FamilyMember("Ali");
        FamilyMember Fin = new FamilyMember("Fin");
        Liz.addChildren(Sue);
        Liz.addChildren(Joe);
        Sue.addChildren(Max);
        Joe.addChildren(Ali);
        Joe.addChildren(Fin);
        Liz.countLeaf();
        System.out.print(Liz.countLeaf());
    }
}
