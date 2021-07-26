interface A{
void go();}

interface D {
void go();}

class B {
public void go(){
System.out.println("GO!");}}

class C extends B implements A, D {}
public class q3 {
public void go(){
System.out.println("GONE!");}

public static void main(String[] args){
    A a = new C();
a.go();}}
