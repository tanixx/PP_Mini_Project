import java.util.Scanner;

public class Prog17 {
    public static void roots(float a, float b, float c) {
        float root1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2.0 * a);
        float root2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2.0 * a);
        System.out.println("Roots are : " + root1 + " , " + root2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Enter Coefficiant if x^2 : ");
        a = sc.nextFloat();
        System.out.print("Enter Coefficiant if x : ");
        b = sc.nextFloat();
        System.out.print("Enter Constant : ");
        c = sc.nextFloat();
        roots(a, b, c);
    }
}
