package 11-09-2025;

public class Car {
    int noofwheels;
    int noofbreaks;
    String color;
    int noofseats;
    double power;
}
public Car(int noofwheels, int noofbreaks, int noofseats, String color, double power){
    this.noofwheels=noofwheels;
    this.noofbreaks=noofbreaks;
    this.noofseats=noofseats;
    this.color=color;

}

class BMWCar extends Car{
    double speed;
    double power;
    public BMWCar(double speed, double power){
        this.speed=speed;
        this.power=power;
    }
}