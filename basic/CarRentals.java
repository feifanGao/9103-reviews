import java.util.*;
public class CarRentals{
    private List<Car> cars;
    public CarRentals(){
        cars = new ArrayList<Car>();
    }
    public void addCars(Car a){
        cars.add(a);
    }
    public int compareCars(Car a, Car b){
        if(a.getRent()>b.getRent())
            return b.getRegistration();
        return a.getRegistration();
    }
    public static void main(String[] args){
        Car a = new Car(123,41415);
        Car b = new Car(125,41414);
        CarRentals r = new CarRentals();
        r.addCars(a);
        r.addCars(b);
        System.out.println(r.compareCars(a,b));

    }


}
