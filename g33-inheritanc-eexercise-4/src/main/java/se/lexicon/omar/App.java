package se.lexicon.omar;

import se.lexicon.omar.model.Car;

public class App
{
    public static void main( String[] args )
    {
        Car car1 = new Car("Volvo");
        car1.colour("white");

        Car car2 = new Car("Audi");
        car2.colour("Black");

        Car car3 = new Car("BMV");
        car3.colour("red");

        Car car4 = new Car("Mercedes");
        car4.colour("yellow");


    }
}
