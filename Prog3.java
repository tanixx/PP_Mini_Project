import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long number = sc.nextLong();
        long fact = 1;
        int ans = 0;
        for (int i = 1; i <= 30; i++) {
            fact = fact * i;
            if (number % fact == 0) {
                ans = i;
            }
        }
        System.out.println("Greatest factiorial as factor in number is: " + ans);
    }
}
