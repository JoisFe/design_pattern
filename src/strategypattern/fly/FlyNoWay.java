package strategypattern.fly;

/**
 * @author : 조재철
 * @since 1.0
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
