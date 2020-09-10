package remind;

public class TvTest {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for (int i=0; i<tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
//            tvArr[i].channel = 10;
        }

        for (int i=0; i<tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println("tvArr[" + i + "] channel :" + tvArr[i].channel);
        }
    }
}


class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}