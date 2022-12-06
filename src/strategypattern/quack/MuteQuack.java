package strategypattern.quack;

/**
 * @author : 조재철
 * @since 1.0
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("조용");
    }
}
