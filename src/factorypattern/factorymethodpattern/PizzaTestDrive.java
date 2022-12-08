package factorypattern.factorymethodpattern;

import factorypattern.factorymethodpattern.pizza.Pizza;
import factorypattern.factorymethodpattern.store.ChicagoStylePizzaStore;
import factorypattern.factorymethodpattern.store.NYStylePizzaStore;
import factorypattern.factorymethodpattern.store.PizzaStore;

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

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("2이 주문한 " + pizza.getName());
    }

}
