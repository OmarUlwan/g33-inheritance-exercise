package se.lexicon.omar.model;

public class Motorcycle extends Vehicle{

    boolean hasSidecar;

    public Motorcycle(String model, String registerNumber, String owner, int speed, String color, boolean hasSidecar) {
        super(model, registerNumber, owner, speed, color);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle");
        super.drive();
        System.out.println("Has sidecar: " + this.hasSidecar);
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
