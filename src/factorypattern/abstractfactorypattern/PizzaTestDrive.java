package factorypattern.abstractfactorypattern;

import factorypattern.abstractfactorypattern.pizza.Pizza;
import factorypattern.abstractfactorypattern.store.ChicagoStylePizzaStore;
import factorypattern.abstractfactorypattern.store.NYStylePizzaStore;
import factorypattern.abstractfactorypattern.store.PizzaStore;

/**
 * @author : 조재철
 * @since 1.0
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("1이 주문한 " + pizza.getName());
        System.out.println();

        pizza = chicagoStore.orderPizza("clams");
        System.out.println("2이 주문한 " + pizza.getName());
    }
}
