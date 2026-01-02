import java.util.*;

class StringNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            try {
                sum += Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                // ignore invalid input
            }
        }
        System.out.println("Total = " + sum);
    }
}

