package factorypattern.abstractfactorypattern.pizzaingredient.factory;

import factorypattern.abstractfactorypattern.pizzaingredient.Cheese;
import factorypattern.abstractfactorypattern.pizzaingredient.Clams;
import factorypattern.abstractfactorypattern.pizzaingredient.Dough;
import factorypattern.abstractfactorypattern.pizzaingredient.Pepperoni;
import factorypattern.abstractfactorypattern.pizzaingredient.Sauce;
import factorypattern.abstractfactorypattern.pizzaingredient.Veggies;

/**
 * @author : 조재철
 * @since 1.0
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
