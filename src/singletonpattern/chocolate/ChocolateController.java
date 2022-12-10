package singletonpattern.chocolate;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler reBoiler = ChocolateBoiler.getInstance();

        System.out.println(boiler);
        System.out.println(reBoiler);


        ChocolateBoiler2 boiler2 = ChocolateBoiler2.getInstance();
        ChocolateBoiler3 boiler3 = ChocolateBoiler3.getInstance();

        boiler2.fill();
        boiler2.boil();
        boiler2.drain();

        boiler3.fill();
        boiler3.boil();
        boiler3.drain();
    }
}
