package BehaviorParameterization.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        Student student1 = new Student(95 , "말루다");
        Student student2 = new Student(93 , "완야마");
        Student student3 = new Student(88 , "드록바");
        Student student4 = new Student(77 , "마켈렐레");
        Student student5 = new Student(66 , "비에이라");
        Student student6 = new Student(43 , "에브라");
        Student student7 = new Student(69 , "은돔벨레");

        List<Student> students = Arrays.asList(student1 , student2 , student3 , student4 , student5 , student6 , student7);
        List<Student> filterStudents = filterAGradeStudent(students , new GradePredicateA());

        for (Student student : filterStudents) {
            System.out.println(student.getName() + " : " + student.getPoint());
        }
    }

    public static List<Student> filterAGradeStudent(List<Student> students , GradePredicate predicate) {
        return students.stream().filter(student -> predicate.test(student)).collect(Collectors.toList());
    }
}
