class Rectangle {
    protected Double length;
    protected Double breadth;

    public Rectangle(Double L, Double B){
        this.length = L;
        this.breadth = B;
    }

    public void area(){
        System.out.println("Area: "+(length*breadth));
    }
    public void perimeter(){
        Double peri = (2*length)+(2*breadth); 
        System.out.println("Perimeter: "+peri);
    }
}
class Square extends Rectangle{
    public Square(Double s){
        super(s, s);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Square S1 = new Square(12.0);
        S1.area();
        S1.perimeter();
        Rectangle R1 = new Rectangle(12.0, 3.5);
        R1.area();
        R1.perimeter();
    }
}
