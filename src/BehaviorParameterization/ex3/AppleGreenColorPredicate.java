package BehaviorParameterization.ex3;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Object o) {
        return Apple.Color.GREEN.equals(((Apple)o).getColor());
    }
}
