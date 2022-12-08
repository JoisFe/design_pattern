package factorypattern.factorymethodpattern.pizza.chicago;

import factorypattern.factorymethodpattern.pizza.Pizza;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        super.name = "시카고 스타일 채소 피자";
        super.dough = "아주 두꺼운 크러스트 도우";
        super.sauce = "플럼토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
