package singletonpattern.chocolate;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ChocolateBoiler3 {

    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler3 uniqueInstance;

    private ChocolateBoiler3() {}

    public static ChocolateBoiler3 getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");

            synchronized (ChocolateBoiler3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler3();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            this.empty = false;
            this.boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            this.empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            this.boiled = true;
        }
    }

    private boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
}
