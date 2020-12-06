package se.lexicon.omar.model;

public class Vehicle {

    private String model;
    private String registerNumber;
    private String owner;
    private int speed;
    private String color;

    public Vehicle(String model, String registerNumber, String owner, int speed, String color) {
        this.model = model;
        this.registerNumber = registerNumber;
        this.owner = owner;
        this.speed = speed;
        this.color = color;
    }

   public void drive(){
       System.out.println("MOdel: " + this.model + "\nRegister umber: " + this.registerNumber + "\nOwner: "
       + this.owner + "\nSpeed: " + this.speed + "\nColor: " + this.color);
   }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

