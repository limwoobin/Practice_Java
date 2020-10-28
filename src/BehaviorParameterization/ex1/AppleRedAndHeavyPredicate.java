package BehaviorParameterization.ex1;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return Apple.Color.RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
