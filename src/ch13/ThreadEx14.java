package ch13;

import javax.swing.*;

public class ThreadEx14 {
    public static void main(String[] args) {
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값 입력:");
        System.out.println("입력한 값: " + input);
        th1.interrupt();
        System.out.println("isInterrupted(): " + th1.isInterrupted());
    }
}

class ThreadEx14_1 extends Thread {
    public void run() {
        int i = 10;
        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("카운트 종료");
    }
}