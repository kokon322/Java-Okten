package homeWork6;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private LocalDate birthDay;

    public Person(int id, String name, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(birthDay, person.birthDay);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode");
        return Objects.hash(id, name, birthDay);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int compereId = this.id - o.getId();
        System.out.println(compereId);
        int compareName = this.name.compareTo(o.getName());
        System.out.println(compareName);
        int compareDate = this.birthDay.compareTo(o.getBirthDay());
        System.out.println(compareDate);

        if (compereId != 0) {
            return compereId;
        }else if (compareName !=0){
            return compareName;
        }else return compareDate;
    }
}
