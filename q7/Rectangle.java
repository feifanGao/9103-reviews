public class Rectangle implements Polygon {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea(){
        return height * width;
    }

    public static void main(String[] args){
        Rectangle test = new Rectangle(2.0,3.5);
        test.display();
        System.out.println("Area: "+test.calculateArea());
    }
}
