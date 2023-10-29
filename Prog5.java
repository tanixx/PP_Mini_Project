import java.util.Scanner;

public class Prog5 {
    public static void reverse(String str) {
        String revstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revstr = ch + revstr;
        }
        System.out.println("Reversed String :" + revstr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        reverse(str);
    }
}
