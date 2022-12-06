package strategypattern.fly;

/**
 * @author : 조재철
 * @since 1.0
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있음!");
    }
}
