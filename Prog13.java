import java.util.Scanner;

public class Prog13 {
    public static void closest(int number, int factor) {
        if (number % factor != 0) {
            for (int i = number; i > 1; i--) {
                if (i % factor == 0) {
                    System.out.println(i + "  is closest multiple of " + factor + " to " + number);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the factor: ");
        int factor = sc.nextInt();
        closest(number, factor);

    }
}
