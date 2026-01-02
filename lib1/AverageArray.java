import java.util.*;
class AverageArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            sum += a[i];
        }

        double avg = sum / 10.0;
        for (int x : a)
            if (x > avg)
                System.out.println(x);
    }
}

