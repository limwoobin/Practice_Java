package ch15;

import java.util.Date;

public class PrintStreamEx {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();

        System.out.printf("문자 %c의 코드는 %d\n" , i , i);
    }
}
