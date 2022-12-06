package strategypattern.duck;

import strategypattern.fly.FlyNoWay;
import strategypattern.quack.Quack;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("나는 모형 오리");
    }
}
