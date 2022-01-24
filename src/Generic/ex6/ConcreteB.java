package Generic.ex6;

public class ConcreteB implements AbstractData {
    private int val;

    public ConcreteB(int val) {
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
        return "ConcreteB{" +
                "val=" + val +
                '}';
    }
}
