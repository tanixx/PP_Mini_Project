import java.util.Scanner;

public class Prog15 {
    public static long factorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        long npr;
        ncr = factorial(n) / factorial(n - r);
        System.out.print("nPr : ");
        System.out.println(npr);
    }
}
