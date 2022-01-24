package Generic.ex6;

public class ConcreteA implements AbstractData {
    private int val;

    public ConcreteA(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ConcreteA{" +
                "val=" + val +
                '}';
    }
}
