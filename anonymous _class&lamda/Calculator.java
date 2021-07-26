import java.util.HashMap;

interface IntegerBinaryOperation{
    int apply(int x, int y);
}

public class Calculator {
    public static void main(String[] args){
        HashMap<String, IntegerBinaryOperation> operations = new HashMap<>();
        operations.put("ADD",new IntegerBinaryOperation(){
            public int apply(int x, int y){
                return x + y;
            }
        });

        operations.put("SUB",new IntegerBinaryOperation(){
            public int apply(int x, int y){
                return x - y;
            }
        });

        operations.put("MUL",new IntegerBinaryOperation(){
            public int apply(int x, int y){
                return x*y;
            }
        });
        
        System.out.println(operations.get("ADD").apply(1,1));
        System.out.println(operations.get("SUB").apply(3,5));
        System.out.println(operations.get("ADD").apply(3,operations.get("SUB").apply(3,operations.get("MUL").apply(2,6))));  
    }
}
