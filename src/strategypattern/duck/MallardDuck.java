package strategypattern.duck;

import strategypattern.fly.FlyWithWings;
import strategypattern.quack.Quack;

/**
 * @author : 조재철
 * @since 1.0
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는 물오리");
    }
}
