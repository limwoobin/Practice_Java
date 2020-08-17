package ch09;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("123.456");
        BigDecimal bd2 = new BigDecimal("5.0");

        System.out.println("bd1=" + bd1);
        System.out.println("tvalue=" + bd1.unscaledValue());
        System.out.println("tscale=" + bd1.scale());
        System.out.println("tprecision=" + bd1.precision());
        System.out.println();

        System.out.println("bd2=" + bd2);
        System.out.println("tvalue=" + bd2.unscaledValue());
        System.out.println("tscale=" + bd2.scale());
        System.out.println("tprecision=" + bd2.precision());
        System.out.println();

        BigDecimal bd3 = bd1.multiply(bd2);
        System.out.println("bd3=" + bd3);
        System.out.println("tvalue=" + bd3.unscaledValue());
        System.out.println("tscale=" + bd3.scale());
        System.out.println("tprecision=" + bd3.precision());
        System.out.println();

        System.out.println(bd1.divide(bd2 , 2 , RoundingMode.HALF_UP));
        System.out.println(bd1.setScale(2 , RoundingMode.HALF_UP));
        System.out.println(bd1.divide(bd2 , new MathContext(2 , RoundingMode.HALF_UP)));
    }
}
