import java.util.Scanner;

public class Prog20 {
    static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenIndex++] = array[i];
            } else {
                oddArray[oddIndex++] = array[i];
            }
        }
        System.out.println("Even numbers:");
        printArray(evenArray, evenIndex);
        System.out.println("Odd numbers:");
        printArray(oddArray, oddIndex);
    }
}
