package Generic.ex2;

public class GenericMethod<T , M> {
    private T name;
    private M age;

    GenericMethod(T name , M age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    //Generic Method
    public static<T , V> boolean compare(GenericMethod<T , V> g1 , GenericMethod<T , V> g2) {
        boolean nameCompare = g1.getName().equals(g2.getName());
        boolean ageCompare = g1.getAge().equals(g2.getAge());

        return  nameCompare && ageCompare;
    }

    public static void main(String[] args) {
        // 타입 파라미터 지정
        GenericMethod<String , Integer> g1 = new GenericMethod<String , Integer>("Jack" , 20);

        // 타입 파라미터 추정
        GenericMethod<String , Integer> g2 = new GenericMethod("Steve" , 30);

        boolean result = GenericMethod.compare(g1 , g2);
        System.out.println(result);
    }
}
