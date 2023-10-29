import java.util.Scanner;

public class Prog18 {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter the element to search for: ");
        int number = sc.nextInt();
        int index = linearSearch(array, number);

        if (index != -1) {
            System.out.println("Element " + number + " found at index " + index);
        } else {
            System.out.println("Element " + number + " not found in the array");
        }
    }
}
