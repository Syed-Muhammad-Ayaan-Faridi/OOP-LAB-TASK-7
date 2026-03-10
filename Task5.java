class Vehicle{
    private Integer speed;
    private String Colour;
    private Integer No_of_wheels;

    public Vehicle(){
        this.speed = 0;
        this.Colour = null;
        this.No_of_wheels = 4;
    }

    public Vehicle(Integer sp,String color,Integer Wheelnum){
        this.speed = sp;
        this.Colour = color;
        this.No_of_wheels = Wheelnum;
    }

    public void setColour(String colour) {
        Colour = colour;
    }
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public void setNo_of_wheels(Integer no_of_wheels) {
        No_of_wheels = no_of_wheels;
    }

    public String getColour() {
        return Colour;
    }
    public Integer getNo_of_wheels() {
        return No_of_wheels;
    }
    public Integer getSpeed() {
        return speed;
    }
}
class MotorVehicle extends Vehicle{
    private String licenseplate;

    public MotorVehicle(){
        super();
        this.licenseplate = null;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getLicenseplate() {
        return licenseplate;
    }
}
class Car extends MotorVehicle{
    private Integer no_of_doors;

    public Car(){
        super();
        no_of_doors = 4;
    }

    public void setNo_of_doors(Integer no_of_doors) {
        this.no_of_doors = no_of_doors;
    }
    public Integer getNo_of_doors() {
        return no_of_doors;
    }

    public void display(){
        System.out.println("Vehicle Speed: " + getSpeed());
        System.out.println("Vehicle Colour: " + getColour());
        System.out.println("Total number of Wheels: " + getNo_of_wheels());
        System.out.println("License Plate of vehicle: " + getLicenseplate());
        System.out.println("Number of Doors in vehicle: " + no_of_doors);
    }
}
public class Task5 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setSpeed(120);
        car.setColour("Red");
        car.setNo_of_wheels(4);
        car.setLicenseplate("ABC123");
        car.setNo_of_doors(4);

        car.display();
    }

}
