import java.util.*;
class WageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();     // 1–7
        int hours = sc.nextInt();
        int rate = switch (day) {
            case 1,2,3 -> 200;
            case 4,5 -> 400;
            case 6 -> 600;
            case 7 -> 800;
            default -> 0;
        };

        double total = rate * hours;
        if (total > 2000)
            total += total * 0.10;

        System.out.println("Wage = " + total);
    }
}

