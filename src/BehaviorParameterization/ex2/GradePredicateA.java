package BehaviorParameterization.ex2;

public class GradePredicateA implements GradePredicate {

    @Override
    public boolean test(Student student) {
        return student.getPoint() >= 90;
    }
}
