package se.lexicon.omar.model;

public class Car extends CarBase implements CarColour{

    public Car(String carName) {
        super(carName);
    }

    @Override
    public void colour(String colour) {
        System.out.println(" with a " + colour + " colour.");
    }
}
