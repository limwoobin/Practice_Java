package BehaviorParameterization.ex2;

public class GradePredicateC implements GradePredicate {
    @Override
    public boolean test(Student student) {
        return student.getPoint() < 80 && student.getPoint() >= 70;
    }
}
