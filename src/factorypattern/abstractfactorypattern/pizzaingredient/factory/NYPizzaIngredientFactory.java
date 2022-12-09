package factorypattern.abstractfactorypattern.pizzaingredient.factory;

import factorypattern.abstractfactorypattern.pizzaingredient.Cheese;
import factorypattern.abstractfactorypattern.pizzaingredient.Clams;
import factorypattern.abstractfactorypattern.pizzaingredient.Dough;
import factorypattern.abstractfactorypattern.pizzaingredient.FreshClams;
import factorypattern.abstractfactorypattern.pizzaingredient.Garlic;
import factorypattern.abstractfactorypattern.pizzaingredient.MarinaraSauce;
import factorypattern.abstractfactorypattern.pizzaingredient.Mushroom;
import factorypattern.abstractfactorypattern.pizzaingredient.Onion;
import factorypattern.abstractfactorypattern.pizzaingredient.Pepperoni;
import factorypattern.abstractfactorypattern.pizzaingredient.RedPepper;
import factorypattern.abstractfactorypattern.pizzaingredient.ReggianoCheese;
import factorypattern.abstractfactorypattern.pizzaingredient.Sauce;
import factorypattern.abstractfactorypattern.pizzaingredient.SlicedPepperoni;
import factorypattern.abstractfactorypattern.pizzaingredient.ThinCrustDough;
import factorypattern.abstractfactorypattern.pizzaingredient.Veggies;

/**
 * @author : 조재철
 * @since 1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
