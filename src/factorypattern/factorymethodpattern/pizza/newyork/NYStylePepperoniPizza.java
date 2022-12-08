package factorypattern.factorymethodpattern.pizza.newyork;

import factorypattern.factorymethodpattern.pizza.Pizza;

/**
 * @author : 조재철
 * @since 1.0
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        super.name = "뉴욕 스타일 소스와 페퍼로니 피자";
        super.dough = "씬 크러스트 도우";
        super.sauce = "마리나라 소스";

        super.toppings.add("잘게 썬 레지아노 치즈");
    }
}
