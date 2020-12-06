package se.lexicon.omar;


import se.lexicon.omar.model.Car;
import se.lexicon.omar.model.Motorcycle;
import se.lexicon.omar.model.Truck;
import se.lexicon.omar.model.Vehicle;

public class App
{
    public static void main( String[] args )
    {
        Vehicle car = new Car("Audi", "ABC 123", "Jon Johansson", 280, "Black", "Automatic", 4);
        Vehicle motorcycle = new Motorcycle ("Nisan", "MOT 123", "Gorge Jor",170, "Red", false );
        Vehicle truck = new Truck("Volvo", "VOL 123", "Sulas MC", 50, "Yellow", 5);

        car.drive();
        System.out.println("===================================");

        motorcycle.drive();
        System.out.println("===================================");

        truck.drive();
        System.out.println("===================================");


    }
}
