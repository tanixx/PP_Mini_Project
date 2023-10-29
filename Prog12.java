import java.util.Scanner;

public class Prog12 {
    public static void isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        int rem = 0;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        System.out.println(sum);
        if (number == sum) {
            System.out.println("Is Armstrong Number.");
        } else {
            System.out.println("Not a Armstrong.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        isArmstrong(number);
    }

}
