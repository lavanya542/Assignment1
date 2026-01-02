import java.time.*;
import java.time.format.*;
import java.util.*;

class DateDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate d1 = LocalDate.parse(sc.next(), f);
        LocalDate d2 = LocalDate.parse(sc.next(), f);

        System.out.println(Math.abs(ChronoUnit.DAYS.between(d1, d2)));
    }
}

