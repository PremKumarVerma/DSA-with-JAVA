
//Write a Java program to calculate and print the sum of two numbers.
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = num.nextInt();
        System.out.println("Enter Second Number");
        int num2 = num.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum =" + sum);

    }
};