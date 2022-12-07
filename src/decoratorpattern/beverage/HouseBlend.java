package decoratorpattern.beverage;

/**
 * @author : 조재철
 * @since 1.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
