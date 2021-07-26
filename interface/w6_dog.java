public class w6_dog implements w6_interface {

    private String region;
    private double landSpeed_kmh = 50.0; 
    private double waterSpeed_kmh = 8.0; 
    private double kmTravelled = 0.0;

    public w6_dog (String region){
        this.region = region;
    }

    public void move(double hours) { 
        if(region.equals("water"))
            kmTravelled += (waterSpeed_kmh *hours); 
        else if(region.equals("land"))
            kmTravelled += (landSpeed_kmh * hours); 
    }

    public double getKMTravelled() { 
        return kmTravelled;
    }
}
