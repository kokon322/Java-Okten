package homeWork7;


import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private int page;

    public Book(String name, int year, int page) {
        this.name = name;
        this.year = year;
        this.page = page;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && page == book.page && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, page);
    }

    @Override
    public String
    toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", page=" + page +
                '}';
    }
}
