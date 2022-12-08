package factorypattern.factorymethodpattern.store;

import factorypattern.factorymethodpattern.pizza.Pizza;
import factorypattern.factorymethodpattern.pizza.chicago.ChicagoStyleCheesePizza;
import factorypattern.factorymethodpattern.pizza.chicago.ChicagoStylePepperoniPizza;
import factorypattern.factorymethodpattern.pizza.chicago.ChicagoStyleVeggiePizza;
import factorypattern.factorymethodpattern.pizza.newyork.NYStyleCheesePizza;
import factorypattern.factorymethodpattern.pizza.newyork.NYStylePepperoniPizza;
import factorypattern.factorymethodpattern.pizza.newyork.NYStyleVeggiePizza;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }

        return null;
    }
}
