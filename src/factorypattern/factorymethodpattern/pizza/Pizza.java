package factorypattern.factorymethodpattern.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 조재철
 * @since 1.0
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("준비 중: " + this.name);
        System.out.println("도우를 올리는 중");
        System.out.println("소스를 뿌리는 중");
        System.out.println("토핑을 올리는 중");

        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("175도에서 25분간 굽기");
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
}