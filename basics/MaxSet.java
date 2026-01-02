import java.util.*;
class MaxSet {
    static int largest(Set<Integer> s) {
        return Collections.max(s);
    }

    public static void main(String[] args) {
        Set<Integer> set = Set.of(10, 30, 20);
        System.out.println(largest(set));
    }
}

