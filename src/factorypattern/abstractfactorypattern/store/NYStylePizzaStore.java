package factorypattern.abstractfactorypattern.store;

import factorypattern.abstractfactorypattern.pizza.CheesePizza;
import factorypattern.abstractfactorypattern.pizza.ClamPizza;
import factorypattern.abstractfactorypattern.pizza.Pizza;
import factorypattern.abstractfactorypattern.pizzaingredient.factory.NYPizzaIngredientFactory;
import factorypattern.abstractfactorypattern.pizzaingredient.factory.PizzaIngredientFactory;

/**
 * @author : 조재철
 * @since 1.0
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (type.equals("clams")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 클램 치즈 피자");
        }

        return pizza;
    }
}
