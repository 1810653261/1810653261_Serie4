package at.ac.fh_kufstein.uebung04.Classes;

public class Car {
    String color;
    int wheels;
    double speed;



public void currentSpeed(){
    System.out.println(speed);

}
public Car(String color, int wheels, double speed)
{
    this.color=color;
    this.wheels=wheels;
    this.speed=speed;

}

public String getColor(String Color)
{
    return color;
}
public int getWheels(int wheels)
{
    return wheels;
}
public double getSpeed(double Speed)
{
    return Speed;
}
public double accelerate(double Geschwindigkeit)
{
 return speed+Geschwindigkeit;
}
public double slowdown(double Geschwindigkeit)
{
 return speed-Geschwindigkeit;
}
}

