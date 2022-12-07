package decoratorpattern.beverage;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Espresso extends Beverage {

    public Espresso() {
        super.description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
