package Generic.ex2;

import java.util.Arrays;
import java.util.List;

public class WildCard {
    public void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object + " ");
        }
    }

    public int sum(List<? extends Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }


    public static void main(String[] args) {
        WildCard wildCard = new WildCard();
        System.out.println(wildCard.sum(Arrays.asList(1,2,3)));
        wildCard.printList(Arrays.asList(5,6,7,8,9));
    }
}
