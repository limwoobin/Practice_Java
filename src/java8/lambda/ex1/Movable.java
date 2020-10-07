package java8.lambda.ex1;

/* FunctionalInterface 어노테이션은 추상 메소드가 1개일때만 적용 가능
   함수형 인터페이스라는것을 알려주기 위한 어노테이션 (추상 메소드가 2개이상이 되면 compile error 발생)
*/
@FunctionalInterface
public interface Movable {
    void move(String str);
}
