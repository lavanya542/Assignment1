import java.util.*;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return id == s.id && name.equals(s.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " " + name;
    }
}

