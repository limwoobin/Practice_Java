package java8.lambda.ex2;

public class Book {
    private String title;
    private String color;
    private int page;

    Book(String title, String color, int page) {
        this.title = title;
        this.color = color;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public Integer getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", page=" + page +
                '}';
    }
}
