import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter The String:");
        String str = word.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println("Reversed string: " + reversed);
    }
}
