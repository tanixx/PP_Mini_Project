import java.util.Scanner;

public class Prog2 {
    public static void fibonacci(int number) {
        int temp1 = 0;
        int temp2 = 1;
        int temp3;
        System.out.print("Fibonacci Series : ");
        System.out.print(temp1 + " " + temp2);
        for (int i = 1; i < number; i++) {

            temp3 = temp1 + temp2;
            System.out.print(" " + temp3);
            temp1 = temp2;
            temp2 = temp3;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        fibonacci(number);

    }
}
