package java8.lambda.ex1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList();
        products.add(new Product("새우깡", 1200, true, "농심", "이마트"));
        products.add(new Product("감자깡", 1200, true, "농심", "이마트"));
        products.add(new Product("양파링", 1000, true, "농심", "홈플러스"));
        products.add(new Product("고구마칩", 3000, true, "오리온", "홈플러스"));
        products.add(new Product("자갈치", 800, true, "오리온", "홈플러스"));
        products.add(new Product("가위", 4000, false, "문방구", "코스트코"));
        products.add(new Product("청소기", 70000, false, "LG", "코스트코"));
        products.add(new Product("양주", 30000, true, "진로", "코스트코"));
        products.add(new Product("곰젤리", 4000, true, "Bear", "코스트코"));

    }

    public static List<Product> filterByName(List<Product> products , String name) {
        List<Product> filterProducts = new ArrayList<>();
        for (Product product : products) {

        }

        return filterProducts;
    }
}
