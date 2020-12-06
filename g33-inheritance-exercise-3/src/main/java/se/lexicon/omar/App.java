package se.lexicon.omar;


import model.Chocolate;
import model.IceCream;
import model.Vanilla;

public class App
{
    public static void main( String[] args )
    {
        // Instance of IceCream.
        IceCream icecream = new IceCream();
        icecream.description();
        System.out.println("===============");

        // Instance of Chocolate.
        IceCream chocolate = new Chocolate();
        chocolate.description();
        System.out.println("===============");

        // Instance of Vanilla.
        IceCream vanilla = new Vanilla();
        vanilla.description();
    }
}
