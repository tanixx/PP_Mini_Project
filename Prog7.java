import java.util.Scanner;

public class Prog7 {
    public static void perfectSquare(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && i == j * j) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        perfectSquare(number);

    }
}
