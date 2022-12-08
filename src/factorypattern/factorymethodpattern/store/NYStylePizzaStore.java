package factorypattern.factorymethodpattern.store;

import factorypattern.factorymethodpattern.pizza.newyork.NYStyleCheesePizza;
import factorypattern.factorymethodpattern.pizza.newyork.NYStylePepperoniPizza;
import factorypattern.factorymethodpattern.pizza.newyork.NYStyleVeggiePizza;
import factorypattern.factorymethodpattern.pizza.Pizza;

/**
 * @author : 조재철
 * @since 1.0
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }

        return null;
    }
}
