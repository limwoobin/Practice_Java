package java8.stream.ex2;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("말루다" , 1 , 100),
                new Student("존테리" , 3 , 200),
                new Student("드록바" , 2 , 150),
                new Student("미켈" , 3 , 300),
                new Student("아넬카" , 1 , 180),
                new Student("로반" , 1 , 120),
        };

        Stream<Student> studentStream = Stream.of(stuArr);

        studentStream.sorted(Comparator.comparing(Student::getScore)
                               .thenComparing(Comparator.naturalOrder()))
                               .forEach(System.out::println);

        studentStream = Stream.of(stuArr);
        IntStream scoreStream = studentStream.mapToInt(Student::getScore);
        IntSummaryStatistics stat = scoreStream.summaryStatistics();

        System.out.println("count : " + stat.getCount());
        System.out.println("sum : " + stat.getSum());
        System.out.println("average : " + stat.getAverage());
        System.out.println("min : " + stat.getMin());
        System.out.println("max : " + stat.getMax());
    }
}
