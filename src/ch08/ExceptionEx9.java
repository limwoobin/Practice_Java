package ch08;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 에러 발생");
            throw e;
        } catch (Exception e) {
            System.out.println("에러 메시지:" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
