import java.util.Scanner;

public class Prog11 {
    public static void isHappyNumber(int number) {
        int temp = number;
        int sum = 0;
        int rem = 0;
        while (temp > 1) {
            while (temp > 0) {
                rem = temp % 10;
                sum = sum + (rem * rem);
                temp = temp / 10;
            }
            temp = sum;
        }
        if (temp == 1) {
            System.out.println("Is a happy number.");
        } else {
            System.out.println("Is not a happy number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        isHappyNumber(number);
    }

}
