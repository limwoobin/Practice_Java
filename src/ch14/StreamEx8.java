package ch14;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

class Student5 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student5(String name , boolean isMale , int hak , int ban , int score) {
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

public class StreamEx8 {
    public static void main(String[] args) {
        Student5[] stuArr = {
            new Student5("나자바" , true , 1 , 1 , 300),
            new Student5("김지미" , false , 1 , 1 , 250),
            new Student5("박자바" , true , 1 , 1 , 180),
            new Student5("김자바" , false , 1 , 2 , 200),
            new Student5("홍자바" , true , 1 , 2 , 130),
            new Student5("뎀자바" , false , 1 , 2 , 220),
            new Student5("파자바" , false , 1 , 3 , 110),
            new Student5("조자바" , true , 1 , 3 , 90),

            new Student5("안자바" , true , 2 , 1 , 300),
            new Student5("김지미" , false , 2 , 1 , 250),
            new Student5("최자바" , true , 2 , 1 , 180),
            new Student5("김자바" , false , 2 , 2 , 200),
            new Student5("홍자바" , true , 2 , 2 , 130),
            new Student5("한자바" , false , 2 , 3 , 70),
            new Student5("엠자바" , false , 2 , 3 , 110),
            new Student5("존자바" , true , 2 , 3 , 90),
        };

        System.out.println("단순 그룹화 반별로");
        Map<Integer , List<Student5>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student5::getBan));

        for (List<Student5> ban : stuByBan.values()) {
            for (Student5 s : ban) {
                System.out.println(s);
            }
        }

        System.out.println("--------------------------------------------");

        System.out.println("단순그룹화 (성적별로)");
        Map<Student5.LEVEL , List<Student5>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student5.LEVEL.HGIH;
                    else if (s.getScore() >= 100) return Student5.LEVEL.MIDDLE;
                    else return Student5.LEVEL.LOW;
                }));

        TreeSet<Student5.LEVEL> keySet = new TreeSet<>(stuByLevel.keySet());
        for (Student5.LEVEL key : keySet) {
            System.out.println("[" + key + "]");
            for (Student5 s : stuByLevel.get(key)) {
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.println("단순 그룹화 + 통계");
        Map<Student5.LEVEL , Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student5.LEVEL.HGIH;
                    else if (s.getScore() >= 100) return Student5.LEVEL.MIDDLE;
                    else return Student5.LEVEL.LOW;
                } , counting()));

        for (Student5.LEVEL key : stuCntByLevel.keySet()) {
            System.out.printf("[%s] - %d명, " , key , stuCntByLevel.get(key));
        }
        System.out.println();

        System.out.println("다중 그룹화(학년별 , 반별)");
        Map<Integer , Map<Integer , List<Student5>>> stuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student5::getHak,
                         groupingBy(Student5::getBan)));



        for (Map<Integer , List<Student5>> hak : stuByHakAndBan.values()) {
            for (List<Student5> ban : hak.values()) {
                System.out.println();
                for (Student5 s : ban) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("다중 그룹화 (학년별 , 반별 1등)");
        Map<Integer , Map<Integer , Student5>> stuByHakAndBanAndMax = Stream.of(stuArr)
                .collect(groupingBy(Student5::getHak,
                        groupingBy(Student5::getBan,
                                collectingAndThen(
                                        maxBy(Comparator.comparingInt(Student5::getScore)),
                                        Optional::get
                                ))));

        for (Map<Integer , Student5> ban : stuByHakAndBanAndMax.values()) {
            for (Student5 s : ban.values()) {
                System.out.println(s);
            }
        }

        System.out.println("다중 그룹화 + 통계 (학년별 , 반별 성적그룹)");
        Map<String , Set<Student5.LEVEL>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s -> s.getHak() + "-" + s.getBan(),
                        mapping(s -> {
                            if (s.getScore() >= 200) return Student5.LEVEL.HGIH;
                            else if (s.getScore() >= 100) return Student5.LEVEL.MIDDLE;
                            else return Student5.LEVEL.LOW;
                        } , toSet())));

        Set<String> keySet2 = stuByScoreGroup.keySet();
        System.out.println(keySet2);

        for (String key : keySet2) {
            System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
        }
    }
}
