package BehaviorParameterization.ex3;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Object o) {
        return ((Apple) o).getWeight() > 150;
    }
}
