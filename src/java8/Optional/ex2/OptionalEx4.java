package java8.Optional.ex2;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx4 {
    public static void main(String[] args) {
        // orElse(new ...) 대신 orElseGet(() -> new ...) -> orElse 는 실행하게되면 ... 부분이 무조건 실행됨.

        Optional<TestVO> testVO = Optional.of(new TestVO());
        TestVO tvo = new TestVO();

        // 안 좋음
        tvo = testVO.orElse(new TestVO());

        // 좋음
        tvo = testVO.orElseGet(TestVO::new);
        tvo = testVO.orElse(tvo); // -> tvo 와 같이 이미 생성됬거나 계산된 값은 orElse 를 사용해도 무방

        // --------------------------------------------------------------------

        // 단지 값을 얻을 목적이라면 Optional 대신 null 비교 (Optional 은 비싸다.)

        // 안좋음
        // return Optional.ofNullable(status).orElse(value);

        // 좋음
        // return status != null ? status : value;

        // --------------------------------------------------------------------

        // Optional 대신 비어있는 컬렉션 반환 (Optional 은 비싸다.)

        // 안 좋음
        // List<Member> members = team.getMembers();
        // return Optional.ofNullable(members);

        // 좋음
        // List<Member> members = team.getMembers();
        // return members != null ? members : Collections.emptyList();

        // --------------------------------------------------------------------

        // Optional<T> 대신 OptionalInt, OptionalLong, OptionalDouble
        Optional<Integer> count = Optional.of(38);  // boxing 발생
        for (int i=0; i<count.get(); i++) {}  // unboxing 발생

        OptionalInt count2 = OptionalInt.of(38); // boxing 발생 안함
        for (int i=0; i<count2.getAsInt(); i++) {} // unboxing 발생 안함
    }
}
