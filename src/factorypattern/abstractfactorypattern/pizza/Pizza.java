package factorypattern.abstractfactorypattern.pizza;

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
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + this.name + " ----\n");
        if (this.dough != null) {
            result.append(this.dough);
            result.append("\n");
        }
        if (this.sauce != null) {
            result.append(this.sauce);
            result.append("\n");
        }
        if (this.cheese != null) {
            result.append(this.cheese);
            result.append("\n");
        }
        if (this.veggies != null) {
            for (int i = 0; i < this.veggies.length; ++i) {
                result.append(this.veggies[i]);
                if (i < this.veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (this.clam != null) {
            result.append(this.clam);
            result.append("\n");
        }
        if (this.pepperoni != null) {
            result.append(this.pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
