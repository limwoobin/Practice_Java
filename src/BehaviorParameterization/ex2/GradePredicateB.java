package BehaviorParameterization.ex2;

public class GradePredicateB implements GradePredicate {
    @Override
    public boolean test(Student student) {
        return student.getPoint() < 90 && student.getPoint() >= 80;
    }
}
