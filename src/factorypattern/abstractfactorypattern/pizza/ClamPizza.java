package factorypattern.abstractfactorypattern.pizza;

import factorypattern.abstractfactorypattern.pizzaingredient.factory.PizzaIngredientFactory;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: " + super.name);

        super.dough = ingredientFactory.createDough();
        super.sauce = ingredientFactory.createSauce();
        super.cheese = ingredientFactory.createCheese();
        super.clam = ingredientFactory.createClam();
    }
}