package enumType.ex2;

/**
 * Created by Drogba on 2021-02-16
 * github : https://github.com/limwoobin
 */
public class Test {
    public static void main(String[] args) {
        String payCode = LegacyPayGroup.getPayGroup("ACCOUNT_TRANSFER");
        PayGroup payGroup = PayGroup.findByPayCode("ACCOUNT_TRANSFER");
        PayGroupAdvanced payGroupAdvanced = PayGroupAdvanced.findByPayType(PayType.KAKAO_PAY);

        System.out.println(payCode);

        System.out.println();

        System.out.println(payGroup);
        System.out.println(payGroup.getTitle());

        System.out.println();

        System.out.println(payGroupAdvanced);
        System.out.println(payGroupAdvanced.getTitle());
    }
}
