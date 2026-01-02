import java.util.*;
class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String s : sc.nextLine().split("[ ,.]"))
            System.out.println(s);
    }
}

