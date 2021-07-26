public class w6_moveani {
    public static void main(String[] args) {
        w6_dog dog = new w6_dog("land");
        w6_interface[] movinganimal = {dog};

        for(w6_interface m:movinganimal)
            m.move(1.0); 
        System.out.println(dog.getKMTravelled());  
    }
}
