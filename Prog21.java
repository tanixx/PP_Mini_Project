import java.util.Scanner;

public class Prog21 {
    static int noOnes(long binaryNumber) {
        int count = 0;
        while (binaryNumber > 0) {
            if (binaryNumber % 10 == 1) {
                count++;
            }
            binaryNumber /= 10;
        }
        return count;
    }

    static int noZeros(long binaryNumber) {
        int count = 0;
        while (binaryNumber > 0) {
            if (binaryNumber % 10 == 0) {
                count++;
            }
            binaryNumber /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binaryNumber = sc.nextLong();

        int Ones = noOnes(binaryNumber);
        int Zeros = noZeros(binaryNumber);
        System.out.println("Number of 0s: " + Zeros);
        System.out.println("Number of 1s: " + Ones);
    }
}
