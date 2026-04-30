//Program to take input from user
//Name: Vinod Dhaware

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){

        //Creating scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.println("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("How many months will you take to become full stack developer? ");
        int months = sc.nextInt();

        System.out.println("\n =====================");
        System.out.println("Hello "+fullName);
        System.out.println("You live in "+city);
        System.out.println("You will become java full stack developer in "+months+" months.");

        //Important: Close scanner(good practice)
        sc.close();

    }
}
