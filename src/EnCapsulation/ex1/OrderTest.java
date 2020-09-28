//package EnCapsulation.ex1;
//
//public class OrderTest {
//    // (1) Order의 getMessageTypes 메서드를 사용 할 때 불편하다
//    // 안좋은 캡슐화
//    public void anti_message_test_01() {
//        final Order order = new Order("KAKAO,EMAIL,SMS");
////        final String[] split = order.getMessageTypes().split(",");
//    }
//
//    // (2) KAKAO를 KAOKO 라고 잘못 입력했을 경우
//    public void anti_message_test_02() {
//        final Order order = new Order("KAOKO,EMAIL,SMS");
////        final String[] split = order.getMessageTypes().split(",");
//    }
//
//    // (3) 메시지에 KAKAO, EMAIL, SMS 처럼 공백이 들어 간다면 실패한다
//    public void anti_message_test_03() {
//        final Order order = new Order("KAKAO, EMAIL, SMS");
////        final String[] split = order.getMessageTypes().split(",");
//    }
//
//    // (4) 메시지가 없을 때 빈문자열("")을 보낼 경우
//    public void anti_message_test_04() {
//        final Order order = new Order("");
////        final String[] split = order.getMessageTypes().split(",");
//    }
//
//    // (5) 메시지가 없을 때 null 을 보낼 경우
//    public void anti_message_test_05() {
//        final Order order = new Order(null);
////        order.getMessageTypes().split(",");
//    }
//
//    // (6) 메시지가 중복으로 올경우
//    public void anti_message_test_06() {
//        final Order order = new Order("KAKAO, KAKAO, KAKAO");
////        final String[] split = order.getMessageTypes().split(",");
//    }
//}
