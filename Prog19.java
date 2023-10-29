import java.util.Scanner;

public class Prog19 {
    static int binarySearch(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return mid;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the sorted array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int number = sc.nextInt();

        int index = binarySearch(array, number);

        if (index != -1) {
            System.out.println("Element " + number + " found at index " + index);
        } else {
            System.out.println("Element " + number + " not found in the array");
        }
    }

}
