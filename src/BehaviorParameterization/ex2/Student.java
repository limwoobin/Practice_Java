package BehaviorParameterization.ex2;

public class Student {
    private int point;
    private String name;



    public Student(int point , String name) {
        this.point = point;
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
