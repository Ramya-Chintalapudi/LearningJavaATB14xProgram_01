package Ex_004_JavaPrograms;
import java.util.Scanner;

public class Lab004_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i<= num/2; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
            if(isprime){
                System.out.println("yes it's  a prime number" + num);
            }
            else{
                System.out.println("No it's not a prime number" + num);
            }
    }

}


