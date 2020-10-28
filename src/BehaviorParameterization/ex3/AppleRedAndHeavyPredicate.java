package BehaviorParameterization.ex3;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Object o) {
        return Apple.Color.RED.equals(((Apple)o).getColor()) && ((Apple)o).getWeight() > 150;
    }
}
