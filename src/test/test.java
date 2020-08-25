package test;

import java.util.HashMap;
import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        System.out.println(Kind.CLOVER);
        System.out.println(Kind.CLOVER. name());
        System.out.println(Kind.CLOVER.getText());

        TTT t1 = new TTT() {
            @Override
            void hi() {

            }
        };
    }
}

enum Kind {

    CLOVER("CLOVER");

    private String text;

    Kind(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

abstract class TTT {
    abstract void hi();
}

