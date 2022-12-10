package singletonpattern;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return uniqueInstance;
    }
}
