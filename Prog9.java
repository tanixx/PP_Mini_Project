import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String binaryRepresentation = decimalToBinary(number);

        System.out.println("Binary representation: " + binaryRepresentation);
    }

    static String decimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.insert(0, remainder);
            number /= 2;
        }

        return binary.toString();
    }
}
