package decoratorpattern.condiment;

import decoratorpattern.beverage.Beverage;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = super.beverage.cost();

        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .20;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 두유";
    }
}
