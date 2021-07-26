public class Car{
    private int registration_number;
    private double hourly_rent_amount;
    public Car(int registration_number, double hourly_rent_amount){
        this.registration_number = registration_number;
        this.hourly_rent_amount = hourly_rent_amount;
    }
    public double getRent(){
        return hourly_rent_amount;
    }
    public int getRegistration(){
        return registration_number;
    }
}
