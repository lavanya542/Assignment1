import java.util.*;
class NamesDash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s;

        while (!(s = sc.next()).equals("END"))
            list.add(s);

        System.out.println(String.join("-", list));
    }
}

