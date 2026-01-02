import java.util.*;
class SortLength {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(
            (a,b)-> a.length()!=b.length()?a.length()-b.length():a.compareTo(b)
        );
        ts.add("Java");
        ts.add("C");
        ts.add("Python");
        ts.forEach(System.out::println);
    }
}

