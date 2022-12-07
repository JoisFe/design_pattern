package decoratorpattern.condiment;

import decoratorpattern.beverage.Beverage;

/**
 * @author : 조재철
 * @since 1.0
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();
}
