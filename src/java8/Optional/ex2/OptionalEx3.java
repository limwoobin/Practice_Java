package java8.Optional.ex2;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalEx3 {
    public static void main(String[] args) {
        // isPresent()-get() 대신 orElse()/orElseGet()/orElseThrow()

        Optional<TestVO> testVO = Optional.of(new TestVO());
        TestVO tvo = new TestVO();

        // 안 좋음
        if (testVO.isPresent()) {
            tvo = testVO.get();
        } else {
            tvo = null;
        }

        // 좋음
        tvo = testVO.orElse(null);

        // --------------------------------------------------------------------

        // 안 좋음
        if (testVO.isPresent()) {
            tvo = testVO.get();
        } else {
            throw new NoSuchElementException();
        }

        // 좋음
        tvo = testVO.orElseThrow(NoSuchElementException::new);
    }
}
