package decoratorpattern.condiment;

import decoratorpattern.beverage.Beverage;
import decoratorpattern.condiment.CondimentDecorator;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = super.beverage.cost();

        if (beverage.getSize() == Size.TALL) {
            cost += .20;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .40;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .60;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 모카";
    }
}
