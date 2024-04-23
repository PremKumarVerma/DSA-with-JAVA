//Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num1 = num.nextInt();

        for (int i = 2; i <= num1 / 2 ; i++) {
            
            
            if(num1%i==0){
                System.out.println("The Number is not Prime");
            }
            else{
                System.out.println("The Number is a Prime Number");
            }
        }

    }
}
