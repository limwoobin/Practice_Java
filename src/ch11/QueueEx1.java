package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help 를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q or Q - 프로그램 종료");
                    System.out.println("history - 최근 입력한 명령어를 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류");
            }
        }
    }

    public static void save(String input) {
        if (!"".equals(input)) {
            q.offer(input);
        }

        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}
