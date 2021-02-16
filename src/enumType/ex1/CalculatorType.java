package enumType.ex1;

import java.util.function.Function;

/**
 * Created by Drogba on 2021-02-16
 * github : https://github.com/limwoobin
 */

// enum type 별 business login 처리
public enum CalculatorType {
    CALC_A(value -> value),
    CALC_B(value -> value * 3),
    CALC_C(value -> value * 10),
    CALC_ETC(value -> 0L);

    private final Function<Long , Long> expression;

    CalculatorType(Function<Long , Long> expression) {
        this.expression = expression;
    }

    public long calculate(long value) {
        return expression.apply(value);
    }
}
