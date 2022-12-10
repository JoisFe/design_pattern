package singletonpattern.chocolate;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ChocolateBoiler2 {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler2 uniqueInstance = new ChocolateBoiler2();

    private ChocolateBoiler2() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler2 getInstance() {
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
