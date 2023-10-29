import java.util.Scanner;

public class Prog10 {
    static String decimalToHexadecimal(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();

        while (number > 0) {
            int remainder = number % 16;
            hexadecimal.insert(0, hexChars[remainder]);
            number /= 16;
        }

        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        String hexadecimal = decimalToHexadecimal(number);
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }
}
