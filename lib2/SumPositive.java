import java.util.*;
class SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            if (n > 0) sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}

