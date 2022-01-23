package Generic.ex6;

public class ConcreteAnother {
    private int val;

    public ConcreteAnother(int val) {
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
        return "ConcreteAnother{" +
                "val=" + val +
                '}';
    }
}
