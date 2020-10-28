package BehaviorParameterization.ex1;

public class Apple {
    private double weight;
    private Color color;

    public Apple(double weight , Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    enum Color {
        RED , GREEN;
    }
}
