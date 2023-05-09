package dmytro.zhabskyi.library.models;

public class Book {
    private String id;

    private String title;
    private int age;

    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }

    public Book() {

    }
}
