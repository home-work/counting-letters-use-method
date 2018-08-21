import java.util.Scanner;

public class CountingLetters {
    public static void main(String[] args) {
        String s = getString();
        System.out.println("Số kí tự trong chuỗi là: " + countLetters(s));
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        return scanner.nextLine();
    }

    private static int countLetters(String s) {

        return s.length();
    }
}
