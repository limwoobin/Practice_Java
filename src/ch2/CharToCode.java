package ch2;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X) %n" , ch , code , code);

        System.out.printf("%#X %n" , 65);
        System.out.printf("%#X %n" , 66);
        System.out.printf("%#X %n" , 67);
    }
}
