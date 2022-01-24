package Generic.ex5;

public class Run {
    public static void main(String[] args) {
        GenericArrayList<Integer> list = new GenericArrayList<>();
        list.add(50);

        String val = Integer.toString(list.get(0));

        System.out.println(list.get(0));
        System.out.println(val);

        System.out.println(list.access(3L));
        System.out.println(list.access(0.3d));
    }
}
