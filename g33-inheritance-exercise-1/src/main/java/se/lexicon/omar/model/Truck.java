package se.lexicon.omar.model;

public class Truck extends Vehicle{

    int numberOfAxles;

    public Truck(String model, String registerNumber, String owner, int speed, String color, int numberOfAxles) {
        super(model, registerNumber, owner, speed, color);
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void drive() {
        System.out.println("Truck");
        super.drive();
        System.out.println("Number Of axles: " + this.numberOfAxles);
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
