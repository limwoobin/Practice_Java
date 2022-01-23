package Generic.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericTest2 {
    public static void main(String[] args) {
        AbstractData data = new ConcreteB(5);
        AbstractData data2 = new ConcreteB(4);
        AbstractData data3 = new ConcreteB(3);

        List<AbstractData> list = new ArrayList<>();
        list.add(data);
        list.add(data2);
        list.add(data3);
        listPrint(list);

        ConcreteB concreteB = new ConcreteB(1);
        ConcreteB concreteB2 = new ConcreteB(2);
        ConcreteB concreteB3 = new ConcreteB(3);

        List<AbstractData> concreteBList = new ArrayList<>();
        concreteBList.add(concreteB);
        concreteBList.add(concreteB2);
        concreteBList.add(concreteB3);
        listPrint(concreteBList);

        List<Number> numberList = new ArrayList<>();
        numberList.add(1L);
        numberList.add(2L);
        numberList.add(3L);
        listPrint2(numberList);

        List<Object> objectList = new ArrayList<>();
        objectList.add("object");
        objectList.add(3L);
        objectList.add(25);
        listPrint2(objectList);
    }

    static void listPrint(List<? super ConcreteA> list) {
        for (Object t : list) {
            System.out.println(t);
        }
    }

    static void listPrint2(List<? super Integer> list) {
        for (Object t : list) {
            System.out.println(t);
        }
    }
}
