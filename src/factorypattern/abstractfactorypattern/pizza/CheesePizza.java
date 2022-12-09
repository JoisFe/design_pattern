package factorypattern.abstractfactorypattern.pizza;

import factorypattern.abstractfactorypattern.pizzaingredient.factory.PizzaIngredientFactory;

/**
 * @author : 조재철
 * @since 1.0
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: " + super.name);

        super.dough = ingredientFactory.createDough();
        super.sauce = ingredientFactory.createSauce();
        super.cheese = ingredientFactory.createCheese();
    }
}
