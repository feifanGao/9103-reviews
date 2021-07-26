class Sandwich implements Food {
    private boolean eaten;
    private int weight;
    private int age;

    public Sandwich(int weight, int age) {
        this.weight = weight;
        this.age = age;
        eaten = false;
    }

    public boolean isTasty () {
        return age > 48;
    }
    public int getWeight () {
        return eaten ? 0 : weight;
    }
    public void eat () {
        eaten = true;
    }
}

public class Monster {
    private int weight; // weight in kilograms
    private boolean hungry;
    private boolean angry;
    // implement the constructor
    public Monster (int weight) {
       this.weight = weight;
       hungry = false;
       angry = false;
    }
    // implement this method
    public void feed (Food food) {
        if(food.isTasty()){
            angry = false;
        }
        if(food.getWeight()<0.1*weight){
            hungry = true;
        }
        food.eat();
        if(hungry==true){
            angry = true;
        }
    }

    public void pet () {
        if (hungry) {
            if (angry) {
                System.out.println ("Monster has eaten you");
            }
            else {
                System.out.println("Monster has bitten you");
            }
        }
        else {
            if ( angry ) {
                System.out.println("Monster is content");
            }
            else {
                System.out.println("Monster loves you");
            }
        }
    }

    public static void main(String[] args){
        Monster test = new Monster(10);
        Sandwich sub = new Sandwich(1, 47);
        test.pet();
        test.feed(sub);
        test.pet();
    }
}
