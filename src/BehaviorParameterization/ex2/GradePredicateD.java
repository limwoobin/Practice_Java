package BehaviorParameterization.ex2;

public class GradePredicateD implements GradePredicate {
    @Override
    public boolean test(Student student) {
        return student.getPoint() < 70 && student.getPoint() >= 60;
    }
}
