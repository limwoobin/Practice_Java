package ch14;

import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class StreamEx7 {
    public static void main(String[] args) {
        Student4[] stuArr = {
            new Student4("나자바" , true , 1 , 1 , 300),
            new Student4("김지미" , false , 1 , 1 , 250),
            new Student4("박자바" , true , 1 , 1 , 180),
            new Student4("김자바" , false , 1 , 2 , 200),
            new Student4("홍자바" , true , 1 , 2 , 130),
            new Student4("뎀자바" , false , 1 , 2 , 220),
            new Student4("파자바" , false , 1 , 3 , 110),
            new Student4("조자바" , true , 1 , 3 , 90),

            new Student4("안자바" , true , 2 , 1 , 300),
            new Student4("김지미" , false , 2 , 1 , 250),
            new Student4("최자바" , true , 2 , 1 , 180),
            new Student4("김자바" , false , 2 , 2 , 200),
            new Student4("홍자바" , true , 2 , 2 , 130),
            new Student4("한자바" , false , 2 , 3 , 70),
            new Student4("엠자바" , false , 2 , 3 , 110),
            new Student4("존자바" , true , 2 , 3 , 90),
        };

        System.out.println("성비로 분할");
        Map<Boolean , List<Student4>> stuBySex = Stream.of(stuArr)
                                                    .collect(partitioningBy(Student4::isMale));

        List<Student4> maleStudent = stuBySex.get(true);
        List<Student4> femaleStudent = stuBySex.get(false);

        for (Student4 s : maleStudent) System.out.println(s);
        for (Student4 s : femaleStudent) System.out.println(s);

        System.out.println("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean , Long> stuNumBySex = Stream.of(stuArr)
                                            .collect(partitioningBy(Student4::isMale , counting()));

        System.out.println("남:" + stuNumBySex.get(true));
        System.out.println("여:" + stuNumBySex.get(false));

        System.out.println("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean , Optional<Student4>> topScoreBySex = Stream.of(stuArr)
                                                .collect(partitioningBy(Student4::isMale,
                                                        maxBy(Comparator.comparingInt(Student4::getScore))));

        System.out.println("남 1등:" + topScoreBySex.get(true));
        System.out.println("여 1등:" + topScoreBySex.get(false));

        System.out.println("n4. 다중분할(성별 불합격자 , 100점이하) %n");
        Map<Boolean , Map<Boolean , List<Student4>>> failedStuBySex =
                Stream.of(stuArr).collect(partitioningBy(Student4::isMale ,
                        partitioningBy(s -> s.getScore() <= 100)));

        List<Student4> failedMailStu = failedStuBySex.get(true).get(true);
        List<Student4> failedFemailStu = failedStuBySex.get(false).get(true);

        for (Student4 s : failedMailStu) System.out.println(s);
        for (Student4 s : failedFemailStu) System.out.println(s);
    }
}

class Student4 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student4(String name , boolean isMale , int hak , int ban , int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() { return name; }
    boolean isMale() { return isMale; }
    int getHak() { return hak; }
    int getBan() { return ban; }
    int getScore() { return score; }

    public String toString() {
        return String.format("[ %s , %s , %d학년 %d반 , %3d점]",
                name , isMale ? "남":"여" , hak , ban , score);
    }

    enum LEVEL { HGIH , MIDDLE , LOW };
}