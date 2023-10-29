import java.util.Scanner;

public class Prog4 {
    public static void isPalindrome(long number) {
        long temp, rev, rem;
        temp = number;
        rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }
        if (rev == number) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        long number = sc.nextLong();
        isPalindrome(number);
    }

}
