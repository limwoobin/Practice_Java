package enumType.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Drogba on 2021-02-16
 * github : https://github.com/limwoobin
 */
public class Test {
    public static void main(String[] args) {
        List<EnumMapperValue> list = Arrays.stream(FeeType.values())
                .map(EnumMapperValue::new)
                .collect(Collectors.toList());

        System.out.println(list.toString());
    }
}
