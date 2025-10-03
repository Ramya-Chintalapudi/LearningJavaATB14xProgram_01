package Ex_001_JavaBasics;
import java.util.Scanner; //import scanner

public class Lab003_Scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // create scanner object
        String name = scanner.nextLine();
        String school = scanner.nextLine();  //String whole line input

        int age = scanner.nextInt(); // Integer input
        float height = scanner.nextFloat(); // Double input

        scanner.nextLine();

        String DOB = scanner.nextLine();

        System.out.println("My Name is:" + " " + name);
        System.out.println("School is:" + " " + school);
        System.out.println("Age is:" + " " + age);
        System.out.println("Height is:" + " " + height);
        System.out.println("DOB is:" + " " + DOB);


    }
}
