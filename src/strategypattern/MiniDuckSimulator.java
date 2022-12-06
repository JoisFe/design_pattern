package strategypattern;

import strategypattern.duck.Duck;
import strategypattern.duck.MallardDuck;
import strategypattern.duck.ModelDuck;
import strategypattern.fly.FlyNoWay;
import strategypattern.fly.FlyRocketPowered;

/**
 * @author : 조재철
 * @since 1.0
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
