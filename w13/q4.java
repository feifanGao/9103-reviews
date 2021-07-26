interface A
{
void methodone();
}
interface B extends A{
void methodTwo (int i);
}

abstract class C implements B {
    public void methodone(){
methodTwo(2);
    }
}

class D extends C {
public void methodTwo (int i){
System.out.println(i*i);
}}

public class q4 {
public static void main(String[] args) {

A abc = new D();
abc.methodone();
}}
