package ch07;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D_2 p3 = new Point3D_2();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}


class Point3 {
    int x = 10;
    int y = 20;

    Point3(int x , int y) {
        super();
        this.x = x;
        this.y = y;
    }
}

class Point3D_2 extends Point3 {
    int z = 30;

    Point3D_2() {
        this(100 , 200 , 300);
    }

    Point3D_2(int x , int y , int z) {
        super(x , y);
        this.z = z;
    }
}