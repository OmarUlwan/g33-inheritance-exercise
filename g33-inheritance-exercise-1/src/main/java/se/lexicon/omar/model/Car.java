package se.lexicon.omar.model;

public class Car extends Vehicle{

    String gearbox;
    int numberOfDoors;

    public Car(String model, String registerNumber, String owner, int speed, String color, String gearbox, int numberOfDoors) {
        super(model, registerNumber, owner, speed, color);
        this.gearbox = gearbox;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("Car");
        super.drive();
        System.out.println("Gearbox: " + this.gearbox + "\nNumber of doors: " + this.numberOfDoors);
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
