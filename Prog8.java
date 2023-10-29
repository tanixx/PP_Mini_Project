import java.util.Scanner;

public class Prog8 {
    static int LargestNumber(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return 0;
        }

        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            int largest = LargestNumber(numbers);
            System.out.println("The largest number in the array is: " + largest);
        }

    }
}
