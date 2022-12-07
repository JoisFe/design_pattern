package decoratorpattern;

import decoratorpattern.beverage.Beverage;
import decoratorpattern.beverage.Beverage.Size;
import decoratorpattern.beverage.Espresso;
import decoratorpattern.beverage.HouseBlend;
import decoratorpattern.condiment.Mocha;
import decoratorpattern.condiment.Soy;

/**
 * @author : 조재철
 * @since 1.0
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", 사이즈 : " + beverage.getSize() + ", $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + ", 사이즈 : " + beverage2.getSize() + ", $" + beverage2.cost());
    }

}
