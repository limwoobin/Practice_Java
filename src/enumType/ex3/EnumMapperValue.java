package enumType.ex3;

/**
 * Created by Drogba on 2021-02-16
 * github : https://github.com/limwoobin
 */
public class EnumMapperValue {
    private final String code;
    private final String title;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        this.code = enumMapperType.getCode();
        this.title = enumMapperType.getTitle();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "EnumMapperValue{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
