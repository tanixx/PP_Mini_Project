import java.util.Scanner;

public class Prog6 {
    public static void isPrime(int number) {

        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count = count + 1;
            }
        }
        if (count == 0) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        isPrime(number);

    }
}
