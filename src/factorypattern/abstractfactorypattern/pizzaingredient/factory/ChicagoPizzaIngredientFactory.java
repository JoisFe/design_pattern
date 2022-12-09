package factorypattern.abstractfactorypattern.pizzaingredient.factory;

import factorypattern.abstractfactorypattern.pizzaingredient.BlackOlives;
import factorypattern.abstractfactorypattern.pizzaingredient.Cheese;
import factorypattern.abstractfactorypattern.pizzaingredient.Clams;
import factorypattern.abstractfactorypattern.pizzaingredient.Dough;
import factorypattern.abstractfactorypattern.pizzaingredient.Eggplant;
import factorypattern.abstractfactorypattern.pizzaingredient.FrozenClams;
import factorypattern.abstractfactorypattern.pizzaingredient.MozzarellaCheese;
import factorypattern.abstractfactorypattern.pizzaingredient.Pepperoni;
import factorypattern.abstractfactorypattern.pizzaingredient.PlumTomatoSauce;
import factorypattern.abstractfactorypattern.pizzaingredient.Sauce;
import factorypattern.abstractfactorypattern.pizzaingredient.SlicedPepperoni;
import factorypattern.abstractfactorypattern.pizzaingredient.Spinach;
import factorypattern.abstractfactorypattern.pizzaingredient.ThickCrustDough;
import factorypattern.abstractfactorypattern.pizzaingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
            new Spinach(),
            new Eggplant() };

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}