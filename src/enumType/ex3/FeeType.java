package enumType.ex3;

/**
 * Created by Drogba on 2021-02-16
 * github : https://github.com/limwoobin
 */
public enum FeeType implements EnumMapperType {
    PERCENT("퍼센트"),
    MONEY("금액");

    private final String title;

    FeeType(String title) {
        this.title = title;
    }

    @Override
    public String getCode() {
        return name();
    }

    @Override
    public String getTitle() {
        return title;
    }
}
