package java8.lambda.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    // 어떤 행동(Behavior)을 파라미터로 전달받는다.
    static List<Book> filterBooksByColor(List<Book> bookList , BookPredicate predicate) {
        List<Book> resultList = new ArrayList<>();
        for (Book book : bookList) {
            if (predicate.excute(book)) {
                resultList.add(book);
            }
        }

        return resultList;
    }

    // 출력
    static public void listPrint(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("MadPlay", "green", 500),
                new Book("Hello", "red", 300)
        );

        List<Book> redBooks = filterBooksByColor(bookList , book -> "red".equals(book.getColor()));
        listPrint(redBooks);

        List<Book> page500Books = filterBooksByColor(bookList , book -> 500 <= book.getPage());
        listPrint(page500Books);
    }
}
