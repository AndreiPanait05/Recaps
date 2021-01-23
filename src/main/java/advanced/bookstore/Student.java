package advanced.bookstore;

import java.util.List;

public class Student {
    private int age;
    private String name;
    private List<Book> books;

    public Student() {
    }

    public Student(int age, String name, List<Book> books) {
        this.age = age;
        this.name = name;
        this.books = books;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
