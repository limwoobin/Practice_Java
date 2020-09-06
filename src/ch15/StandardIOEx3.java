package ch15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("text.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (IOException e) {
            System.err.println("File not found");
        }

        System.out.println("Hello by System.out");
        System.err.println("Helo by System.out");
    }
}
