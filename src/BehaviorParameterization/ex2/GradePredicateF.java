package BehaviorParameterization.ex2;

public class GradePredicateF implements GradePredicate {
    @Override
    public boolean test(Student student) {
        return student.getPoint() < 60;
    }
}
