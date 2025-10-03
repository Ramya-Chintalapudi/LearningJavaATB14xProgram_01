package Ex_003_IF_ELSE;
import java.util.Scanner;

public class Lab004_TriangleProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int side_1 = scanner.nextInt();
        int side_2 = scanner.nextInt();
        int side_3 = scanner.nextInt();

        if (side_1 == side_2 && side_2 == side_3) {
            System.out.println("Equilateral Triangle");
        } else if (side_1 == side_2 || side_2 == side_3 || side_3 == side_1) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}