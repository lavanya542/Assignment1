import java.util.*;
class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = new Random().nextInt(25) + 1;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Guess: ");
            int guess = sc.nextInt();
            if (guess == random) {
                System.out.println("Correct!");
                return;
            } else {
                System.out.println("Wrong attempt " + i);
            }
        }
        System.out.println("Number was: " + random);
    }
}

