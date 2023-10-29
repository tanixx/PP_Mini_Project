public class Prog25 {
    public static void main(String[] args) {
        // Print ASCII values of digits 0-9
        System.out.println("ASCII values of digits 0-9:");
        for (int digit = 0; digit < 10; digit++) {
            int asciiValue = (int) '0' + digit;
            System.out.println(digit + ": " + asciiValue);
        }

        // Print ASCII values of alphabets a-z
        System.out.println("\nASCII values of alphabets a-z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int asciiValue = (int) ch;
            System.out.println(ch + ": " + asciiValue);
        }
    }
}
