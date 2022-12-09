package factorypattern.abstractfactorypattern.store;

import factorypattern.abstractfactorypattern.pizza.Pizza;

/**
 * @author : 조재철
 * @since 1.0
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
