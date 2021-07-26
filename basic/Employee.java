import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[args.length/2];
        String name = null;
        int count = 0;
        int max = 0;
        for(int i = 0;i<args.length;i++){
            if(i%2==0) {
                name = args[i];
            }else{
                int salary = Integer.parseInt(args[i]);
                employees[count] = new Employee(name,salary);
                if(salary>max){
                    max = salary;
                }
                count++;
            } 
        }
        for(int i = 0;i<count;i++){
            if(employees[i].salary == max){
                System.out.println(employees[i].name);
            }
        }
        
    }
}
