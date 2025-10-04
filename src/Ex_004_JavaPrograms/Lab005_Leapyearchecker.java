package Ex_004_JavaPrograms;
import java.util.Scanner;

public class Lab005_Leapyearchecker {
    /*Create a program that determines whether a given year is a leap year.
    A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
    Use an if-else statement to make this determination*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4 == 0 || year%400 == 0) && year%100 !=0){
            System.out.println("Yes this year is a leap year");
        }
        else {
            System.out.println("No this year is not a leap year");
        }
    }


}
