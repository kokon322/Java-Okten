package homeWork7;

import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<Book> bookList;

    public Person(int id, String name, int age, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bookList = bookList;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(bookList, person.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, bookList);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bookList=" + bookList +
                '}';
    }
}