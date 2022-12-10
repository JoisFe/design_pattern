package singletonpattern;

/**
 * @author : 조재철
 * @since 1.0
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
}
